package com.example.KwikBuck.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.KwikBuck.R;
import com.google.android.material.tabs.TabLayout;

public class ExploreFragment extends Fragment {


    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_explore, container, false);


        tabLayout = view.findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("All"));
        tabLayout.addTab(tabLayout.newTab().setText("Deals"));
        tabLayout.addTab(tabLayout.newTab().setText("Devices"));
        tabLayout.addTab(tabLayout.newTab().setText("Returned"));
        tabLayout.addTab(tabLayout.newTab().setText("All"));
        tabLayout.addTab(tabLayout.newTab().setText("Deals"));
        tabLayout.addTab(tabLayout.newTab().setText("Devices"));
        tabLayout.addTab(tabLayout.newTab().setText("Returned"));


        return view;

    }
}
