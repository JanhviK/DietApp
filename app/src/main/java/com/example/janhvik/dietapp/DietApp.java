package com.example.janhvik.dietapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DietApp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_app);
    }
    public void buttonClick(View view){
        Intent intent =new Intent(DietApp.this,countmycal.class);
        startActivity(intent);
    }
    public void buttonClick3(View view){
        Intent intent =new Intent(DietApp.this,foodcal.class);
        startActivity(intent);
    }
    public void buttonClick4(View view){
        Intent intent =new Intent(DietApp.this,recipe.class);
        startActivity(intent);
    }
}
