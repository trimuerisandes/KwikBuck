package com.example.KwikBuck.fragments;

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
import com.example.KwikBuck.activities.ProductViewActivity;

public class UserProfileProfileFragment extends Fragment  {

    LinearLayout product_view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        product_view = view.findViewById(R.id.product_view);

        product_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ProductViewActivity.class);
                startActivity(intent);
            }
        });
        return view;

    }
}
