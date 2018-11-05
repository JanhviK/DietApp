package com.example.janhvik.dietapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class countmycal extends AppCompatActivity {

    EditText height,weight,age;
    TextView result;
    Button calculate;
    RadioGroup rg;
    private RadioButton rb,maleval,femaleval;
    float bmr,bmi;
    int rbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countmycal);
        height=(EditText)findViewById(R.id.etheight);
        weight=(EditText)findViewById(R.id.etweight);
        age=(EditText)findViewById(R.id.etage);
        result=(TextView)findViewById(R.id.tvresult);
        calculate=(Button)findViewById(R.id.calculate);
        rg=(RadioGroup)findViewById(R.id.rggender);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                maleval =(RadioButton)findViewById(R.id.rbmale);
                femaleval=(RadioButton)findViewById(R.id.rbfemale);

                int selectedId = rg.getCheckedRadioButtonId();

                String heightstr = height.getText().toString();
                String weightstr = weight.getText().toString();
                String agestr = age.getText().toString();

                if (heightstr != null && !"".equals(heightstr) && weightstr != null && !"".equals(weightstr) && agestr != null && !"".equals(agestr)) {
                    float heightvalue = Float.parseFloat(heightstr);
                    float weightvalue = Float.parseFloat(weightstr);
                    float agevalue = Float.parseFloat(agestr);
                    float hval = Float.parseFloat(heightstr)/100;
                    bmi=weightvalue/(hval*hval);
                    if (selectedId == maleval.getId()) {
                        weightvalue = (13.75f * (weightvalue));
                        heightvalue = (5f * (heightvalue));
                        agevalue = (6.76f * (agevalue));
                        bmr = (66 + weightvalue + heightvalue - agevalue);
                    } else if(selectedId == femaleval.getId()){
                        weightvalue = (9.6f * (weightvalue));
                        heightvalue = (1.8f * (heightvalue));
                        agevalue = (4.7f * (agevalue));
                        bmr =(655 + weightvalue + heightvalue - agevalue);
                    }

                }
                String bmilabel="";
                String we="";
                if(Float.compare(bmi,15f)<=0){
                    bmilabel="very severely underweight"+"\n"+"Normal BMI: 18.5 - 25";
                    we="You need to increase your weight";
                }
                else if(Float.compare(bmi,15f)>0 && Float.compare(bmi,16f)<=0){
                    bmilabel="severely underweight"+"\n"+"Normal BMI: 18.5 - 25";
                    we="You need to increase your weight";
                }
                else if(Float.compare(bmi,16f)>0 && Float.compare(bmi,18.5f)<=0){
                    bmilabel="underweight"+"\n"+"Normal BMI: 18.5 - 25";
                    we="You need to increase your weight";
                }
                else if(Float.compare(bmi,18.5f)>0 && Float.compare(bmi,25f)<=0){
                    bmilabel="normal";
                    we="Congratulations you are fit";
                }
                else if(Float.compare(bmi,25f)>0 && Float.compare(bmi,30f)<=0){
                    bmilabel="overweight"+"\n"+"Normal BMI: 18.5 - 25";
                    we="You need to reduce your weight";
                }
                else if(Float.compare(bmi,30f)>0 && Float.compare(bmi,35f)<=0){
                    bmilabel="obesed"+"\n"+"Normal BMI: 18.5 - 25";
                    we="You need to reduce your weight";
                }
                else if(Float.compare(bmi,35f)>0 && Float.compare(bmi,40f)<=0){
                    bmilabel="severely obesed"+"\n"+"Normal BMI: 18.5 - 25";
                    we="You need to reduce your weight";
                }
                else {
                    bmilabel="extremely obesed";
                    we="You need to reduce your weight";
                }
                bmilabel="BMI : "+ bmi+" "+bmilabel+"\n\n";
                String bmrlabel="";
                bmrlabel= bmr+" calories required in a day";
                String label=bmilabel + bmrlabel+"\n\n"+ we;
                result.setText(label);

            }
        });


    }


}

