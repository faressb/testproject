package com.pfe.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Acceuil extends AppCompatActivity implements View.OnClickListener {
    EditText textMSG;
    EditText phoneNo;
    TextView desc;
    Button envoiButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
        textMSG  = (EditText) findViewById(R.id.textMSG);
        desc = (TextView) findViewById(R.id.desc);
        envoiButton = (Button) findViewById(R.id.envoiButton);
        envoiButton.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        String number = phoneNo.getText().toString();
        String sms = textMSG.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(number, null, sms, null, null);
            Toast.makeText(getApplicationContext(), "SMS Sent!",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "SMS faild, please try again later!",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
