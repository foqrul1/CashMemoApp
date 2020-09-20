package com.example.cashmemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class bogo extends AppCompatActivity {
    EditText qnty_1, qnty_2;
    Button save3, save4;
    int a= 0, b = 0, c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bogo);
        
        qnty_1 = findViewById(R.id.bogoEt1);
        qnty_2 = findViewById(R.id.bogoEt2);
        
        //save3 = findViewById(R.id.save3);
        save4 = findViewById(R.id.save4);
        
        save4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(qnty_1.getText().toString());
                b = Integer.parseInt(qnty_2.getText().toString());
                if(a>0 && b>0){
                    if((a+b)>=4){
                         c = (a+b)/4;
                        Toast.makeText(bogo.this, "Congrats!! you got our Best offer. you are requested to get your "+c*10+" more products from products A or Products B.", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(bogo.this, "Congrats!! you got our BOGO offer. you are requested to get your "+a+"  more products from products A and "+b+" more products from products B", Toast.LENGTH_SHORT).show();
                   /* }else if(b>0){
                        Toast.makeText(bogo.this, "Congrats!! you got our BOGO offer. you are requested to get your "+b+"  more products from products B .", Toast.LENGTH_SHORT).show();

                    }*/
                    }
                }else{
                    if(a>0){
                        Toast.makeText(bogo.this, "Congrats!! you got our BOGO offer. you are requested to get your "+a+"  more products from products A .", Toast.LENGTH_SHORT).show();
                    }else if(b>0){
                        Toast.makeText(bogo.this, "Congrats!! you got our BOGO offer. you are requested to get your "+b+"  more products from products B .", Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(bogo.this, "Please Enter a nonzero Number or any on negative number.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}