package com.example.KwikBuck.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.KwikBuck.R;
import com.example.KwikBuck.activities.CashOutActivity;
import com.example.KwikBuck.activities.FavoritesActivity;
import com.example.KwikBuck.activities.FeaturedPackagesActivity;
import com.example.KwikBuck.activities.MyOrderActivity;
import com.example.KwikBuck.activities.SettingsActivity;
import com.example.KwikBuck.activities.SupportActivity;
import com.example.KwikBuck.activities.WalletActivity;

public class UserProfileSettingFragment extends Fragment  {

    Context context;
    Intent intent;
    LinearLayout btn_profile,btn_wallet,btn_myorder,btn_favorites,btn_support,btn_about,btn_police;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.settings_main, container, false);


        context = view.getContext();
        btn_profile = view.findViewById(R.id.btn_profile_setting);
        btn_wallet = view.findViewById(R.id.btn_wallet);
        btn_myorder = view.findViewById(R.id.btn_myorder);
        btn_favorites = view.findViewById(R.id.btn_favourites);
        btn_support = view.findViewById(R.id.btn_support);
        btn_about = view.findViewById(R.id.btn_about);
        btn_police = view.findViewById(R.id.btn_police);



        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, SettingsActivity.class);
                startActivity(intent);
            }
        });

        btn_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, WalletActivity.class);
                startActivity(intent);
            }
        });

        btn_myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, MyOrderActivity.class);
                startActivity(intent);
            }
        });

        btn_favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, FavoritesActivity.class);
                startActivity(intent);
            }
        });

        btn_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context, SupportActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
