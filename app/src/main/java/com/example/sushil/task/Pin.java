package com.example.sushil.task;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Pin extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    ImageView im1,im2,im3,im4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pin);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        im1=(ImageView)findViewById(R.id.im1);
        im2=(ImageView)findViewById(R.id.im2);
        im3=(ImageView)findViewById(R.id.im3);
        im4=(ImageView)findViewById(R.id.im4);

        final TextView n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,dec,curre,usd,sym;
        n0=(TextView)findViewById(R.id.n_0);
        n1=(TextView)findViewById(R.id.n_1);
        n2=(TextView)findViewById(R.id.n_2);
        n3=(TextView)findViewById(R.id.n_3);
        n4=(TextView)findViewById(R.id.n_4);
        n5=(TextView)findViewById(R.id.n_5);
        n6=(TextView)findViewById(R.id.n_6);
        n7=(TextView)findViewById(R.id.n_7);
        n8=(TextView)findViewById(R.id.n_8);
        n9=(TextView)findViewById(R.id.n_9);
        dec=(TextView)findViewById(R.id.deci);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState()) {
                    im1.setImageResource(R.drawable.pass);
                }
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im2.setImageResource(R.drawable.pass);
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im3.setImageResource(R.drawable.pass);
                else if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.nopass).getConstantState())
                    im4.setImageResource(R.drawable.pass);
            }
        });

        ImageView backs,forw,back;
        backs=(ImageView)findViewById(R.id.backss);
        forw=(ImageView)findViewById(R.id.forwar);
        back= (ImageView)findViewById(R.id.back1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Send.class);
                startActivity(i);
            }
        });

        backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.pass).getConstantState()) {
                    im4.setImageResource(R.drawable.nopass);
                }
                else if (im3.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.pass).getConstantState())
                    im3.setImageResource(R.drawable.nopass);
                else if (im2.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.pass).getConstantState())
                    im2.setImageResource(R.drawable.nopass);
                else if (im1.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.pass).getConstantState())
                    im1.setImageResource(R.drawable.nopass);
            }
        });

        forw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (im4.getDrawable().getConstantState()==Pin.this.getResources().getDrawable(R.drawable.pass).getConstantState()) {
                    Toast.makeText(getApplicationContext(), "Transaction Complete", Toast.LENGTH_LONG).show();
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Enter Pin First",Toast.LENGTH_SHORT).show();
                }
            }
        });

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.fullscreen_content);


        // Set up the user interaction to manually show or hide the system UI.
        mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button.
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void toggle() {
        if (mVisible) {
            hide();
        } else {
            show();
        }
    }

    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);
        mVisible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }

    @SuppressLint("InlinedApi")
    private void show() {
        // Show the system bar
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        mVisible = true;

        // Schedule a runnable to display UI elements after a delay
        mHideHandler.removeCallbacks(mHidePart2Runnable);
        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }
}
