package ru.mirea.khadzhioglo.phoneandtabletmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMIREA;
    private Button btnFIO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMIREA = findViewById(R.id.button);
        btnFIO = findViewById(R.id.button2);

//        View.OnClickListener oclBtnMIREA = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri address = Uri.parse("https://www.mirea.ru/");
//                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
//                startActivity(openLinkIntent);
//            }
//        };
//        btnMIREA.setOnClickListener(oclBtnMIREA);
//
//        View.OnClickListener oclBtnFIO = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent shareIntent = new Intent(Intent.ACTION_SEND);
//                shareIntent.setType("text/plain");
//                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
//                shareIntent.putExtra(Intent.EXTRA_TEXT, "Хаджиогло Максим Иванович");
//                startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
//            }
//        };
//        btnFIO.setOnClickListener(oclBtnFIO);

    }
    public void onClickBtnMIREA(View v) {
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openLinkIntent);
    }
    public void onClickBtnFIO(View v) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Хаджиогло Максим Иванович");
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
    }


}