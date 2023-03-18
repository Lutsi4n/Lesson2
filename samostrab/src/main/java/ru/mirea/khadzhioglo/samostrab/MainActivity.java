package ru.mirea.khadzhioglo.samostrab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, MyTimePickerDialog.TimePickerListener {
    TextView textView;
    Button btnTime;
    Button btnProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);



        btnTime = findViewById(R.id.buttonTime);
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timePicker = new MyTimePickerDialog();
                timePicker.setCancelable(false);
                timePicker.show(getSupportFragmentManager(), "timePicker");
            }
        });



        btnProgress = findViewById(R.id.buttonProgress);
        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("Download");
                progressDialog.setMessage("Loading...");
//                progressDialog.setCancelable(false);  // делает загрузку не отменяемой
                progressDialog.show();
            }
        });



        Button butnDate = (Button) findViewById(R.id.buttonDate);
        butnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new MyDatePickerDialog();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        textView.setText(currentDateString);
    }
    @Override
    public void onTimeSet (TimePicker timePicker, int hour, int minute){
        textView.setText(hour + ":" + minute);
    }
}