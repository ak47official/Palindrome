package com.example.palindromechecker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText getnum;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getnum = findViewById(R.id.getnum);
        Button check = findViewById(R.id.check);
        result = findViewById(R.id.result);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = getnum.getText().toString();
                String reverse = new StringBuilder(str).reverse().toString();
                if (str.equals(reverse)) {
                    result.setText(str + " is a palindrome number.");
                } else {
                    result.setText(str + " is not a palindrome number.");
                }
            }
        });
    }
}
