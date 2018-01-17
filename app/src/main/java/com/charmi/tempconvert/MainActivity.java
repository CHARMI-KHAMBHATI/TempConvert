package com.charmi.tempconvert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.charmi.tempconvert.R.id.edittxt;

public class MainActivity extends AppCompatActivity {

    private EditText etxt;
    RadioButton celsiusButton,fahrenheitButton;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxt = (EditText) findViewById(edittxt);
        celsiusButton = (RadioButton) findViewById(R.id.radio1);
        fahrenheitButton = (RadioButton) findViewById(R.id.radio2);
        b = (Button) findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,
                        IntentsActivity.class);
                startActivity(i);

            }
        });
    }

    public void covt(View v){


            if (etxt.getText().length() == 0) {

                Toast.makeText(this, "Please enter a valid number",
                        Toast.LENGTH_LONG).show();


        }


        try{
            float inputValue = Float.parseFloat(etxt.getText().toString());
            if (celsiusButton.isChecked()) {
                etxt.setText(String
                        .valueOf(ConvertUtils.convertFahrenheitToCelsius(inputValue)));
                celsiusButton.setChecked(false);
                fahrenheitButton.setChecked(true);
            } else {
                etxt.setText(String
                        .valueOf(ConvertUtils.convertCelsiusToFahrenheit(inputValue)));
                fahrenheitButton.setChecked(false);
                celsiusButton.setChecked(true);
            }

        }catch (Exception e){

            Log.d("Error is here",e.toString());
                Toast.makeText(this,"Invalid input",Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}
