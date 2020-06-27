package com.example.KwikBuck.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.KwikBuck.R;
import com.example.KwikBuck.fragments.ExploreFragment;
import com.example.KwikBuck.fragments.HomeFragment;
import com.example.KwikBuck.fragments.MessagesFragment;
import com.example.KwikBuck.fragments.UserProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity  extends AppCompatActivity {

    Context context;
    BottomNavigationView m_navigation;
    TextView title_header;
    Toolbar toolbar;
    ImageView button_notif;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        m_navigation = findViewById(R.id.navigation);
        title_header = findViewById(R.id.title_header);
        toolbar = findViewById(R.id.toolbar);
        button_notif =  findViewById(R.id.button_notif);
        floatingActionButton = findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fab_onclick((Activity) context,getWindow().getDecorView().getRootView());
            }
        });

        button_notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MyActivityActivity.class);
                startActivity(intent);
            }
        });

        Fragment f = new HomeFragment();
        loadFragment(f);

        m_navigation.setOnNavigationItemSelectedListener(item -> {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.action_home:
                    fragment = new HomeFragment();
                    title_header.setText("Home");
                    toolbar.setVisibility(View.VISIBLE);
                    break;

                case R.id.action_explore:
                    fragment = new ExploreFragment();
                    title_header.setText("Explore");
                    toolbar.setVisibility(View.VISIBLE);
                    break;

                case R.id.action_messages:
                    fragment = new MessagesFragment();
                    title_header.setText("Messages");
                    toolbar.setVisibility(View.VISIBLE);
                    break;

                case R.id.action_account:
                    fragment = new UserProfileFragment();
                    toolbar.setVisibility(View.GONE);
                    break;
            }

            return loadFragment(fragment);
        });
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public static void fab_onclick(Activity activity, View view) {
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        //ViewGroup viewGroup = view.findViewById(android.R.id.content);

        if (view == null){

        }else {
            //then we will inflate the custom alert dialog xml that we created
            View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.fab_product_tapped, null, false);


            //Now we need an AlertDialog.Builder object
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

            //setting the view of the builder to our custom view that we already inflated
            builder.setView(dialogView);

            //finally creating the alert dialog and displaying it
            final AlertDialog alertDialog = builder.create();


            // Get screen width and height in pixels
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            // The absolute width of the available display size in pixels.
            int displayWidth = displayMetrics.widthPixels;
            // The absolute height of the available display size in pixels.
            int displayHeight = displayMetrics.heightPixels;

            // Initialize a new window manager layout parameters
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

            // Copy the alert dialog window attributes to new layout parameter instance
            layoutParams.copyFrom(alertDialog.getWindow().getAttributes());


            // Set alert dialog width equal to screen width 70%
            int dialogWindowWidth = (int) (displayWidth * 0.9f);
            // Set alert dialog height equal to screen height 70%
            int dialogWindowHeight = (int) (displayHeight * 0.9f);

            // Set the width and height for the layout parameters
            // This will bet the width and height of alert dialog
            layoutParams.width = dialogWindowWidth;
            layoutParams.height = dialogWindowHeight;


            // Apply the newly created layout parameters to the alert dialog window
            alertDialog.getWindow().setAttributes(layoutParams);
            RelativeLayout lyt = dialogView.findViewById(R.id.root_layout);
            lyt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    alertDialog.dismiss();
                }
            });







            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.setCancelable(true);
            alertDialog.show();



        }

    }
}
