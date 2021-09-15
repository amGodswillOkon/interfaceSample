package com.example.interfacetesting;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
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
    public void printAccountNumber(long accNumber) {
        Log.d(String.valueOf(accNumber), " is my the account number");

    }
}



