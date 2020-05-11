package com.example.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sp_main,sp_vicc;
    private TextView txtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp_main=findViewById(R.id.spinner);
        sp_vicc=findViewById(R.id.spinner2);

        txtShow=findViewById(R.id.textView2);


        String[] vicc_meal_array={"咖啡☕","果汁🍹","汽水"};
        ArrayAdapter<String> ad_vicc=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,vicc_meal_array);
        sp_vicc.setAdapter(ad_vicc);


    }

    public void btnOK(View view) {
        Spinner sp_main=(Spinner)findViewById(R.id.spinner);

        String main = sp_main.getSelectedItem().toString();
        String vicc = sp_vicc.getSelectedItem().toString();

        TextView show = (TextView)findViewById(R.id.textView2);
        show.setText("主餐："+ main + "\n" +"附餐：" + vicc);
    }
}
