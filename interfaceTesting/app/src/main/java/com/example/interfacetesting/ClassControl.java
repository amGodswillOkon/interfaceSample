package com.example.interfacetesting;

import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Implement the abstract interface methods
 */

public class ClassControl implements InterfaceMethods {

          @Override
    public void printName () {
         String name = "Godswill Okon ";
         Log.d(name, "is my name");
    }

    @Override
    public int printAccountNumber(int accNumber) {
          return accNumber;
    }
}



