package com.example.harrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private CheckBox ck1,ck2,ck3;
    private RadioButton g1,g2;
    private RatingBar rt;
    private TextView kq;
    private Button btht;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        sp = findViewById(R.id.sp1);
        String[] list= {"Xuan", "Nguyễn", "Trường"};
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,R.layout.item,list);

        sp.setAdapter(adapter);
        initView();

        btht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss="Check box:";
                if(ck1.isChecked()){
                    ss+=ck1.getText()+",";
                }
                if(ck2.isChecked()){
                    ss+=ck2.getText()+",";
                }
                if(ck3.isChecked()){
                    ss+=ck3.getText()+",";
                }
                if(ss.endsWith(",")){
                    ss=ss.substring(0,ss.length());
                }
                ss+="\nGioi tinh:";
                if(g1.isChecked()){
                    ss+=g1.getText();
                }
                if(g2.isChecked()){
                    ss+=g2.getText();
                }
                ss+="\nRating"+rt.getRating();
                ss+="\n"+sp.getSelectedItem().toString();
                kq.setText(ss);
            }
        });
    }



    private void initView(){
        ck1 = findViewById(R.id.ck1);
        ck2 = findViewById(R.id.ck2);
        ck3 = findViewById(R.id.ck3);
        g1 = findViewById(R.id.gnam);
        g2 = findViewById(R.id.gnu);
        rt = findViewById(R.id.rating);
        btht = findViewById(R.id.bt);
        kq = findViewById(R.id.kq);
        sp = findViewById(R.id.sp1);
    }
}