package com.example.interfacetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
/**
 * Simple code to demonstrates how interface is used in Java
 */


public class MainActivity extends AppCompatActivity  {

    InterfaceMethods interfaceMethods = new ClassControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * calling the (interface) methods
         */
        interfaceMethods.printName();

        int accountNumber = interfaceMethods.printAccountNumber(1);
        Toast.makeText(getApplicationContext(), "my Account Number is: " + accountNumber, Toast.LENGTH_LONG).show();

      }
}


