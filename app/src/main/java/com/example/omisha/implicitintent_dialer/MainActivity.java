package com.example.omisha.implicitintent_dialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton dialBtn,callBtn;
        final EditText numberEt;

        numberEt = (EditText) findViewById(R.id.numberEt);
        dialBtn = (ImageButton) findViewById(R.id.dialBtn);
        callBtn = (ImageButton) findViewById(R.id.callBtn);

        dialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                i.setAction(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + numberEt.getText().toString()));
                startActivity(i);

            }
        });


        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent();
                j.setAction(Intent.ACTION_DIAL);
                j.setData(Uri.parse("tel:" + numberEt.getText().toString()));
                startActivity(j);

            }
        });
    }
}
