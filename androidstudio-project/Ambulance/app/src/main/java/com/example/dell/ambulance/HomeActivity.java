package com.example.dell.ambulance;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.dell.ambulance.ambulance.AmbulanceFragment;
import com.example.dell.ambulance.information.InfoFragment;
import com.example.dell.ambulance.status.StatusFragment;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FrameLayout flFragmentContainer;
    BottomNavigationView bottomNavHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        bottomNavHome = (BottomNavigationView) findViewById(R.id.home_bottom_nav);
        bottomNavHome.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_nav_info:
                        loadFragmentByTag("info");
                        return true;
                    case R.id.home_nav_status:
                        loadFragmentByTag("status");
                        return true;
                    case R.id.home_nav_ambulance:
                        loadFragmentByTag("ambu");
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    private void loadFragmentByTag(String tag) {
        Fragment curr = getSupportFragmentManager().findFragmentByTag(tag);
        if (curr == null) {
            if (tag.equals("info")) curr = new InfoFragment();
            else if (tag.equals("ambu")) curr = new AmbulanceFragment();
            else if (tag.equals("status")) curr = new StatusFragment();
            else return;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, curr, tag).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home_op_share) {
            shareApp();
            return true;
        } else if (id == R.id.home_op_rate) {
            rateApp();
            return true;
        } else if (id == R.id.home_op_settings) {
            return true;
        } else if (id == R.id.home_op_signout) {
            doSignOut();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home_nav_status) {

        } else if (id == R.id.home_nav_info) {

        } else if (id == R.id.home_nav_ambulance) {

        } else if (id == R.id.home_nav_share) shareApp();
        else if (id == R.id.home_nav_rate) rateApp();
        else if (id == R.id.home_nav_settings) {

        } else if (id == R.id.home_nav_signout) doSignOut();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void rateApp() {

    }

    private void shareApp() {

    }
    
    private void doSignOut() {

    }
}
