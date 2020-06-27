package com.example.KwikBuck.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.KwikBuck.R;

public class WalletActivity extends AppCompatActivity {

    Context context;
    LinearLayout button_billing_info, btn_payment_info,btn_bank_acount,btn_featured_packages,btn_cash_out;
    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_26_6);
        context =this;
        button_billing_info = findViewById(R.id.button_billing_info);
        btn_payment_info = findViewById(R.id.button_payment_info);
        btn_bank_acount = findViewById(R.id.button_bank_account);
        btn_featured_packages = findViewById(R.id.button_featured_packages);
        btn_cash_out = findViewById(R.id.button_cashout);



        button_billing_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context,BillingInfoActivity.class);
                startActivity(intent);
            }
        });

        btn_payment_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context,PaymentInfoActivity.class);
                startActivity(intent);
            }
        });

        btn_bank_acount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context,BankAccountActivity.class);
                startActivity(intent);
            }
        });

        btn_featured_packages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context,FeaturedPackagesActivity.class);
                startActivity(intent);
            }
        });

        btn_cash_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(context,CashOutActivity.class);
                startActivity(intent);
            }
        });
    }
}
