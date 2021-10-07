package com.dpe.autocompleteviewe41202167;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] KOTA = new String[]{
            "JAKARTA", "YOGYAKARTA", "SURABAYA", "MALANG", "JEMBER", "BANYUMAS", "PUWOKERTO"
    };
    AutoCompleteTextView autoCompletekota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompletekota = findViewById(R.id.autoCompletekota);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KOTA);
        autoCompletekota.setAdapter(adapter);
    }
}