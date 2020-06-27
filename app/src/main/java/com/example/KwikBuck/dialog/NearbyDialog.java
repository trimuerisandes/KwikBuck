package com.example.KwikBuck.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.example.KwikBuck.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


import java.text.NumberFormat;
import java.util.Locale;



public class NearbyDialog extends BottomSheetDialogFragment {

    //var
    Context mContext;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_update_2, container, false);

        mContext = getActivity();

        Bundle bundle = this.getArguments();






        return view;
    }





    //set full bottomsheet
    View bottomSheet;
    View view;
    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            bottomSheet = dialog.findViewById(R.id.design_bottom_sheet1);
            bottomSheet.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
        }

        view = getView();
        view.post(new Runnable() {
            @Override
            public void run() {
                View parent = (View) view.getParent();
                CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) (parent).getLayoutParams();
                CoordinatorLayout.Behavior behavior = params.getBehavior();
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
                bottomSheetBehavior.setPeekHeight(view.getMeasuredHeight());
                ((View) bottomSheet.getParent()).setBackgroundColor(Color.TRANSPARENT);

            }
        });
    }





}
