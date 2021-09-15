package com.example.interfacetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    /**
     * Simple code to demonstrates how interface is used in Java
     */

    InterfaceMethods interfaceMethods = new ClassControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interfaceMethods.printAccountNumber(20521878744L);
        interfaceMethods.printName();

      }
}