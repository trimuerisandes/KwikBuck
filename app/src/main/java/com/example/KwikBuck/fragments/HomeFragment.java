package com.example.KwikBuck.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.KwikBuck.R;
import com.example.KwikBuck.activities.MainActivity;
import com.example.KwikBuck.dialog.MapUserDialog;
import com.example.KwikBuck.dialog.NearbyDialog;

public class HomeFragment extends Fragment  {

    View people1,people2;
    ImageView search_fab;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        people1 = view.findViewById(R.id.people);
        people2 = view.findViewById(R.id.people1);
        search_fab = view.findViewById(R.id.search_fab);

        search_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle argument = new Bundle();
                NearbyDialog dialog = new NearbyDialog();
                dialog.setArguments(argument);
                dialog.show(
                        ((FragmentActivity) getContext()).getSupportFragmentManager(),
                        dialog.getTag());
            }
        });


        people1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle argument = new Bundle();
                MapUserDialog dialog = new MapUserDialog();
                dialog.setArguments(argument);
                dialog.show(
                        ((FragmentActivity) getContext()).getSupportFragmentManager(),
                        dialog.getTag());
            }
        });

        people2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle argument = new Bundle();
                MapUserDialog dialog = new MapUserDialog();
                dialog.setArguments(argument);
                dialog.show(
                        ((FragmentActivity) getContext()).getSupportFragmentManager(),
                        dialog.getTag());
            }
        });

        return view;

    }
}
