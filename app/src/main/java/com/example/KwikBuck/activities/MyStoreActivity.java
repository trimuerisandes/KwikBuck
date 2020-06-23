package com.example.KwikBuck.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.KwikBuck.R;
import com.google.android.material.tabs.TabLayout;

public class MyStoreActivity extends AppCompatActivity {

    TabLayout tabLayout;
//    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my_store_front);

        tabLayout = findViewById(R.id.tabLayoutMyStore);

//        viewPager = findViewById(R.id.viewPager);
        tabLayout.addTab(tabLayout.newTab().setText("Store Front"));
        tabLayout.addTab(tabLayout.newTab().setText("Listing"));
        tabLayout.addTab(tabLayout.newTab().setText("Store Profile"));
//        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
//            @Override
//            public Fragment getItem(int position) {
//                if(position==0){
//                    return new StoreFrontFragment();
//                }else if (position==1){
//                    return new StoreProfileFragment();
//                }else {
//                    return new StoreProfileFragment();
//                }
//            }
//
//            @Override
//            public int getCount() {
//                return 2;
//            }
//        });
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//            }
//        });



    }
}