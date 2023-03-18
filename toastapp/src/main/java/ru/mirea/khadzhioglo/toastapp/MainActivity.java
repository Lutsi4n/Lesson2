package ru.mirea.khadzhioglo.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName);
    }

    public void onClickToast(View view){
        editText.getText();
        Toast toast = Toast.makeText(getApplicationContext(),
                ("СТУДЕНТ №24 ГРУППА БСБО-07-21 Количество символов - "+ editText.getText().length()),
                Toast.LENGTH_SHORT);
        toast.show();
    }

}