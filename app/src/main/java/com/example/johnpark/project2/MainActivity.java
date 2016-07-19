package com.example.johnpark.project2;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public int Htotal=0;
    public int Atotal=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Pointer(View view){

        switch(view.getId()){
            case R.id.point3_1:
                Htotal+=3;
                break;
            case R.id.point2_1:
                Htotal+=2;
                break;
            case R.id.point1_1:
                Htotal+=1;
                break;
            case R.id.point3_2:
                Atotal+=3;
                break;
            case R.id.point2_2:
                Atotal+=2;
                break;
            case R.id.point1_2:
                Atotal+=1;
                break;
            case R.id.reset_1:
                Htotal=0;
                break;
            case R.id.reset_2:
                Atotal=0;
                break;

        }
        TextView score1 = (TextView) findViewById(R.id.score_1);
        TextView score2 = (TextView) findViewById(R.id.score_2);
        score1.setText(""+Htotal);
        score2.setText(""+Atotal);

    }
}
