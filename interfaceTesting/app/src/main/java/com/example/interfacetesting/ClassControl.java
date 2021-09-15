package com.example.interfacetesting;

import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Implement and overriding the abstract interface methods
 */

public class ClassControl implements InterfaceMethods {

          @Override
    public void printName () {
         String name = "Godswill Okon ";
         Log.d(name, "is my name");
    }

    @Override
    public int printAccountNumber(int accNumber) {
              int toSub = 2052187;

        return accNumber + toSub;
    }
}



