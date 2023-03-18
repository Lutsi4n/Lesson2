package ru.mirea.khadzhioglo.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        textView = findViewById(R.id.textView222);
        if (extras != null) {
            value = extras.getString("key");
            textView.setText(value);
//            The key argument here must match that used in the other activity
            Log.d(SecondActivity.class.getSimpleName(), value);
        }
        Log.d(SecondActivity.class.getSimpleName(), value);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(SecondActivity.class.getSimpleName(), value);
    }
}