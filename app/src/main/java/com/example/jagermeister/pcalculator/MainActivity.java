package com.example.jagermeister.pcalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtEnterPer;
    private EditText edtEnterNum;
    private Button btnCal;
    private TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtEnterPer = (EditText) findViewById(R.id.edtEnterPercentage);
        edtEnterNum = (EditText) findViewById(R.id.edtEnterNumber);
        btnCal = (Button) findViewById(R.id.btnCalculateResult);
        txtRes = (TextView) findViewById(R.id.txtResult);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtRes.setBackgroundColor(Color.LTGRAY);
                float percentNumVal = Float.parseFloat(edtEnterPer.getText().toString());
                float decimalVal = percentNumVal/100;
                float result = decimalVal* Float.parseFloat(edtEnterNum.getText().toString());
                txtRes.setText(Float.toString(result));

                txtRes.setText(Float.toString( (Float.parseFloat(edtEnterPer.getText().toString())/100)* Float.parseFloat(edtEnterNum.getText().toString())));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}