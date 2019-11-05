package com.example.alertdialog08102019;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonAlertDialog);


//        Banhmi banhmi = new Banhmi("Banh tron","Salad son","Ca chua bi","Sot bo","Pepsi");
//        Banhmi banhmi = new BanhmiFastFood()
//                                    .loai("Banh que")
//                                    .cachua("Ca chua bi")
//                                    .nuocuong("Pepsi")
//                                    .build();
//        1 : Cac chuc nang set cho o banh mi
//        2 : Build o banh mi voi cac nang muon set lai

        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Hop thoai xac nhan tat app ? ");
                builder.setMessage("Ban hay xac nhan ben duoi!!!");
                builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });
    }
}
