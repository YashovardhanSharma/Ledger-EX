package com.example.sushil.task;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.ViewPager;
import android.text.Html;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.TextView;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView btc,ltc,stm,dsh,eth,btcl,ltcl,stml,dshl,ethl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // getActionBar().setTitle(Html.fromHtml("<font color=\"#000000\">"+getString(R.string.app_name)+"</font>"));
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        btc=(TextView)findViewById(R.id.btc);
        ltc=(TextView)findViewById(R.id.ltc);
        stm=(TextView)findViewById(R.id.stm);
        dsh=(TextView)findViewById(R.id.dsh);
        eth=(TextView)findViewById(R.id.eth);
        btcl=(TextView)findViewById(R.id.btcl);
        ethl=(TextView)findViewById(R.id.ethl);
        ltcl=(TextView)findViewById(R.id.ltcl);
        stml=(TextView)findViewById(R.id.stml);
        dshl=(TextView)findViewById(R.id.dshl);




        ImageButton send, recieve, buy;
        send=(ImageButton)findViewById(R.id.send);
        recieve=(ImageButton)findViewById(R.id.recieve);
        buy=(ImageButton)findViewById(R.id.buy);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Send.class);
                startActivity(i1);
            }
        });

        recieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(getApplicationContext(), Recieve.class);
                startActivity(i2);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toolbar.post(new Runnable() {
            @Override
            public void run() {
                Drawable d= ResourcesCompat.getDrawable(getResources(),R.drawable.menuicon,null);
                toolbar.setNavigationIcon(d);
            }
        });
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            finish();
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.btcb) {
            btc.setTextColor(Color.parseColor("#FF425D87"));
            ltc.setTextColor(Color.parseColor("#A9A9A9"));
            eth.setTextColor(Color.parseColor("#A9A9A9"));
            stm.setTextColor(Color.parseColor("#A9A9A9"));
            dsh.setTextColor(Color.parseColor("#A9A9A9"));
            btcl.setBackgroundResource(R.drawable.round);
            stml.setBackgroundResource(R.drawable.roundg);
            ltcl.setBackgroundResource(R.drawable.roundg);
            dshl.setBackgroundResource(R.drawable.roundg);
            ethl.setBackgroundResource(R.drawable.roundg);

        } else if (id == R.id.ethb) {
            btc.setTextColor(Color.parseColor("#A9A9A9"));
            ltc.setTextColor(Color.parseColor("#A9A9A9"));
            eth.setTextColor(Color.parseColor("#FF425D87"));
            stm.setTextColor(Color.parseColor("#A9A9A9"));
            dsh.setTextColor(Color.parseColor("#A9A9A9"));
            btcl.setBackgroundResource(R.drawable.roundg);
            stml.setBackgroundResource(R.drawable.roundg);
            ltcl.setBackgroundResource(R.drawable.roundg);
            dshl.setBackgroundResource(R.drawable.roundg);
            ethl.setBackgroundResource(R.drawable.round);

        } else if (id == R.id.ltcb) {
            btc.setTextColor(Color.parseColor("#A9A9A9"));
            ltc.setTextColor(Color.parseColor("#FF425D87"));
            eth.setTextColor(Color.parseColor("#A9A9A9"));
            stm.setTextColor(Color.parseColor("#A9A9A9"));
            dsh.setTextColor(Color.parseColor("#A9A9A9"));
            btcl.setBackgroundResource(R.drawable.roundg);
            stml.setBackgroundResource(R.drawable.roundg);
            ltcl.setBackgroundResource(R.drawable.round);
            dshl.setBackgroundResource(R.drawable.roundg);
            ethl.setBackgroundResource(R.drawable.roundg);

        } else if (id == R.id.stmb) {
            btc.setTextColor(Color.parseColor("#A9A9A9"));
            ltc.setTextColor(Color.parseColor("#A9A9A9"));
            eth.setTextColor(Color.parseColor("#A9A9A9"));
            stm.setTextColor(Color.parseColor("#FF425D87"));
            dsh.setTextColor(Color.parseColor("#A9A9A9"));
            btcl.setBackgroundResource(R.drawable.roundg);
            stml.setBackgroundResource(R.drawable.round);
            ltcl.setBackgroundResource(R.drawable.roundg);
            dshl.setBackgroundResource(R.drawable.roundg);
            ethl.setBackgroundResource(R.drawable.roundg);

        } else if (id == R.id.dshb) {
            btc.setTextColor(Color.parseColor("#A9A9A9"));
            ltc.setTextColor(Color.parseColor("#A9A9A9"));
            eth.setTextColor(Color.parseColor("#A9A9A9"));
            stm.setTextColor(Color.parseColor("#A9A9A9"));
            dsh.setTextColor(Color.parseColor("#FF425D87"));
            btcl.setBackgroundResource(R.drawable.roundg);
            stml.setBackgroundResource(R.drawable.roundg);
            ltcl.setBackgroundResource(R.drawable.roundg);
            dshl.setBackgroundResource(R.drawable.round);
            ethl.setBackgroundResource(R.drawable.roundg);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
