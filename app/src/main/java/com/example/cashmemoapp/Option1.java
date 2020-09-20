package com.example.cashmemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Option1 extends AppCompatActivity {
    EditText productsA, productsB;
    Button btnA, btnB;
    int qnty1=0,price1, qnty2=0, price2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option1);


        productsA = findViewById(R.id.price1);
        productsB = findViewById(R.id.price2);
        btnA = findViewById(R.id.save1);
        btnB = findViewById(R.id.save2);
        /*qnty1 = Integer.parseInt(productsA.getText().toString());
        qnty2 = Integer.parseInt(productsB.getText().toString());*/


        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                qnty1 = Integer.parseInt(productsA.getText().toString());
                qnty1= Integer.parseInt(productsA.getText().toString());

                                     if(qnty1<10){
                    Toast.makeText(Option1.this, "You have no discount. for "+qnty1+" you can buy 100 BDT price for per products", Toast.LENGTH_SHORT).show();
                }else if(qnty1>=10 && qnty1<20){
                    Toast.makeText(Option1.this, "Congrats!! you will get 10% discount for buying "+qnty1+" products. you can buy 90 BDT for per products now", Toast.LENGTH_SHORT).show();
                }else if(qnty1>=20 && qnty1<30){
                    Toast.makeText(Option1.this, "Congrats!! you will get 15% discount for buying "+qnty1+" products. you can buy 85 BDT for per products now", Toast.LENGTH_SHORT).show();
                }else if(qnty1<=0){
                    Toast.makeText(Option1.this, "Wrong input !! please enter any Nonzero or non-negative value", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Option1.this, "Congrats!! you will get 20% discount for buying "+qnty1+" products. you can buy 80 BDT for per products now", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qnty2= Integer.parseInt(productsB.getText().toString());
                if(qnty2<10){
                    Toast.makeText(Option1.this, "Sorry!! You have no discount. for "+qnty2+" you can buy 200 BDT price for per products", Toast.LENGTH_SHORT).show();
                }else if(qnty2>=10 && qnty2<20){
                    Toast.makeText(Option1.this, "Congrats!! you will get 10% discount for buying "+qnty2+" products. you can buy 180 BDT for per products now", Toast.LENGTH_SHORT).show();
                }else if(qnty2>=20 && qnty2<30){
                    Toast.makeText(Option1.this, "Congrats!! you will get 15% discount for buying "+qnty2+" products. you can buy 170 BDT for per products now", Toast.LENGTH_SHORT).show();
                }else if(qnty2<=0){
                    Toast.makeText(Option1.this, "Wrong input !! please enter any Nonzero or non-negative value", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Option1.this, "Congrats!! you will get 20% discount for buying "+qnty2+" products. you can buy 160 BDT for per products now", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}