package com.example.dell.ambulance;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
||||||| merged common ancestors
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
=======
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
>>>>>>> 7ea5667a3926b555dd1dd4a9691744e30a464f83
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.dell.ambulance.ambulance.AmbulanceFragment;
import com.example.dell.ambulance.information.InfoFragment;
import com.example.dell.ambulance.status.StatusFragment;

import com.example.dell.ambulance.account.SignInActivity;
import com.example.dell.ambulance.ambulance.AmbulanceFragment;
import com.example.dell.ambulance.information.InfoFragment;
import com.example.dell.ambulance.map.MapFragment;
import com.example.dell.ambulance.settings.SettingsActivity;
import com.example.dell.ambulance.status.StatusActivity;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

<<<<<<< HEAD
    private final String FRAGMENT_MAP = "map",
            FRAGMENT_AMBULANCE = "ambulance", FRAGMENT_INFO = "info";

    private BottomNavigationView bottomNav;

||||||| merged common ancestors
=======
    FrameLayout flFragmentContainer;
    BottomNavigationView bottomNavHome;

>>>>>>> 7ea5667a3926b555dd1dd4a9691744e30a464f83
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
<<<<<<< HEAD

        bottomNav = (BottomNavigationView) findViewById(R.id.home_bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_bottom_nav_map:
                        changeFragmentTo(FRAGMENT_MAP);
                        return true;
                    case R.id.home_bottom_nav_ambulance:
                        changeFragmentTo(FRAGMENT_AMBULANCE);
                        return true;
                    case R.id.home_bottom_nav_info:
                        changeFragmentTo(FRAGMENT_INFO);
                        return true;
                    default:
                        return false;
                }
            }
        });
        bottomNav.setSelectedItemId(R.id.home_bottom_nav_map);
||||||| merged common ancestors
=======

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
>>>>>>> 7ea5667a3926b555dd1dd4a9691744e30a464f83
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
        getMenuInflater().inflate(R.menu.home_op_menu, menu);
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
            startActivity(new Intent(HomeActivity.this, SettingsActivity.class));
            return true;
        } else if (id == R.id.home_op_signout) {
            doSignOut();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.home_nav_status:
                startActivity(new Intent(HomeActivity.this, StatusActivity.class));
                break;
            case R.id.home_nav_info:
                bottomNav.setSelectedItemId(R.id.home_bottom_nav_info);
                break;
            case R.id.home_nav_ambulance:
                bottomNav.setSelectedItemId(R.id.home_bottom_nav_ambulance);
                break;
            case R.id.home_nav_share:
                shareApp();
                break;
            case R.id.home_nav_rate:
                rateApp();
                break;
            case R.id.home_nav_settings:
                startActivity(new Intent(HomeActivity.this, SettingsActivity.class));
                break;
            case R.id.home_nav_signout:
                doSignOut();
                break;
            default:
                Log.d("HomeActivity", "id oNavigationItemSelected : "+id);
                return false;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void changeFragmentTo(String fragmentTag) {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag(fragmentTag);
        if (fragment == null) {
            switch (fragmentTag) {
                case FRAGMENT_MAP:
                    fragment = new MapFragment();
                    break;
                case FRAGMENT_AMBULANCE:
                    fragment = new AmbulanceFragment();
                    break;
                case FRAGMENT_INFO:
                    fragment = new InfoFragment();
                    break;
                default:
                    return;
            }
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.home_fragment_container, fragment, fragmentTag)
                .commit();
    }

    private void rateApp() {

    }

    private void shareApp() {

    }

    private void doSignOut() {
        startActivity(new Intent(HomeActivity.this, SignInActivity.class));
        finish();
    }
}
