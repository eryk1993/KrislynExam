package com.example.iscofbnc.coffeeorderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numCoffee=0;
    int coffeePrice=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void submitOrder(View view) {

                displayPrice(numCoffee * coffeePrice);

        }

        public void increment(View view){
            numCoffee++;
            display(numCoffee);
        }

        public void decrement(View view){
            if(numCoffee>0){
                numCoffee--;
            }
            display(numCoffee);
        }


        private void display(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.quantity);
            quantityTextView.setText("" + number);
        }

        private void displayPrice(double number){
            TextView priceTextView = (TextView) findViewById(R.id.price);
            priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        }

    }
