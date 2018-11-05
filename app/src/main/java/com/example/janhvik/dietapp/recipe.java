package com.example.janhvik.dietapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class recipe extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        toolbar = (Toolbar)findViewById(R.id.tbrecipe);
        toolbar.setTitle("Recipes");
        listView = (ListView)findViewById(R.id.lvrecipe);
        ArrayAdapter<String> mAdapter= new ArrayAdapter<String>(recipe.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Rec));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i,long l){
                Intent intent = new Intent(recipe.this,R_1.class);
                intent.putExtra("RecipeName",listView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });
        listView.setAdapter(mAdapter);
    }
}
