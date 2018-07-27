package deseodevelopers.com.navigationdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "";
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set variable to drawer_layout
        mDrawerLayout = findViewById(R.id.drawer_layout);

        // Instantiate nav_view XML
        NavigationView navigationView = findViewById(R.id.nav_view);

        // Navigation on click listener
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.home:
                return true;

            case R.id.work:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.calendar:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.location:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.camera:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.dashboard:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.creditcard:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.tools:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.settings:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.info:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        //Close Navigation Drawer
        mDrawerLayout.closeDrawer(GravityCompat.START);
        // GENERIC CODE return true;
        // The user's action was not recognized.
        // Inovoke the superclass to handle it.
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.home:
                return true;

            case R.id.work:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.calendar:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.location:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.camera:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.dashboard:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.creditcard:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.tools:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.settings:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case R.id.info:
                //mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }


}