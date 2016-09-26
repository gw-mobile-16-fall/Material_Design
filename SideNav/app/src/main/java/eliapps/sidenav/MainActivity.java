package eliapps.sidenav;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

// Declare new class that subclasses AppCompactActivity and implements
// the NavigationView OnNavigationItemSelectedListener protocol
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Finds the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // Set the toolbar found previously as the tool bar for this activity
        setSupportActionBar(toolbar);
        // Find the floating action button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        // Set the on click listener for the floating action button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creates new view that appears on the bottom of the screen when the
                // floating action button is pressed
                Snackbar.make(view, "Floating Action Button Action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Find the drawer layout used for the side nav
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Set the toggle states for the drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        // Find the side navigation view
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        // Set this activity as the listener for the side nav
        navigationView.setNavigationItemSelectedListener(this);
    }

    // Function to run whenever the back button is pressed
    // This could be an actual back button or just the user tapping
    // out of the nav bar
    @Override
    public void onBackPressed() {
        // Find the drawer layout
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // See if the drawer was open
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            // Close the drawer if it was open
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    // Function to create the menu options
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // Function for dealing with options items that were selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Function for dealing with navigation items that were selected
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // Below are all the different navigation selection items
        // Any code that should run when a row is pressed should be
        // added in the appropriate if statement
        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        // Find the drawer layout and close it
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
