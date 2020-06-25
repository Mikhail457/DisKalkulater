package com.example.kalkulater;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal5);

        // кнопка назад
        Button back5 = (Button)findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(CalFive.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        //кнопка назад конец

        Button doing5 = (Button)findViewById(R.id.doing5);
        doing5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String oper = "";
                    EditText ves1 = (EditText)findViewById(R.id.editTextNumberDecimal12);
                    EditText pn1= (EditText)findViewById(R.id.editTextNumberDecimal13);
                    EditText vp1= (EditText)findViewById(R.id.editTextNumberDecimal14);
                    EditText ve1= (EditText)findViewById(R.id.editTextNumberDecimal15);
                    EditText opd1= (EditText)findViewById(R.id.editTextNumberDecimal16);
                    EditText opz1= (EditText)findViewById(R.id.editTextNumberDecimal17);
                    EditText di1= (EditText)findViewById(R.id.editTextNumberDecimal18);

                    TextView vv1 = (TextView)findViewById(R.id.vv);
                    TextView vo1 = (TextView)findViewById(R.id.vo);
                    TextView vvves1 = (TextView)findViewById(R.id.vvves);
                    TextView diy1 = (TextView)findViewById(R.id.diy);
                    TextView diykg1 = (TextView)findViewById(R.id.diykg);
                    TextView tpd1 = (TextView)findViewById(R.id.tpd);
                    TextView tpdkg1 = (TextView)findViewById(R.id.tpdkg);
                    TextView vpml1 = (TextView)findViewById(R.id.vpml);
                    TextView veml1 = (TextView)findViewById(R.id.veml);
                    TextView otnpe1 = (TextView)findViewById(R.id.otnpe);



                    float ves = Float.parseFloat(ves1.getText().toString());
                    float pn = Float.parseFloat(pn1.getText().toString());
                    float vp = Float.parseFloat(vp1.getText().toString());
                    float ve = Float.parseFloat(ve1.getText().toString());
                    float opd = Float.parseFloat(opd1.getText().toString());
                    float opz = Float.parseFloat(opz1.getText().toString());
                    float di = Float.parseFloat(di1.getText().toString());


                    float l1 = vp + ve;
                    vv1.setText(l1 + oper);

                    float l2 = opd + opz;
                    vo1.setText(l2 + oper);

                    float l3 = l1 / ves;
                    vvves1.setText(l3 + oper);

                    float l4 = di/pn;
                    diy1.setText(l4 + oper);

                    float l5 = di / ves / pn;
                    diykg1.setText(l5 + oper);

                    float l6 = opd / pn;
                    tpd1.setText(l6 + oper);

                    float l7 = opd / ves / pn;
                    tpdkg1.setText(l7 + oper);

                    float l8 = vp / ves;
                    vpml1.setText(l8 + oper);

                    float l9 = ve / ves;
                    veml1.setText(l9 + oper);

                    float l10 = ve / l1 * 100;
                    otnpe1.setText(l10 + oper);

                    // считает при нажатие на кнопку


                }catch (Exception e){

                }
            }
        });


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    // системная кнопка назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(CalFive.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
    }
}