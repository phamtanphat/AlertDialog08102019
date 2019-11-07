package com.example.alertdialog08102019;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonAlertDialog);
        //ctrl + .


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
                builder.setTitle("Chọn ngôn ngữ sử dụng");
//                builder.setMessage("Các ngữ thông dụng");
//                builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                    }
//                });
//                builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                    }
//                });
//                builder.setNeutralButton("Huy", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.dismiss();
//                    }
//                });

                final String[] arrayLang = {"C","C++","Java","Php","Javascript","Scala"};
                boolean[] arrayChecked = {false,false,false,false,false,false};
//                builder.setSingleChoiceItems(arrayLang, -1, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int position) {
//                        Toast.makeText(MainActivity.this, arrayLang[position], Toast.LENGTH_SHORT).show();
//                        dialog.dismiss();
//                    }
//                });
                builder.setMultiChoiceItems(arrayLang, arrayChecked, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        if (isChecked){
                            Toast.makeText(MainActivity.this, "Đã check", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(MainActivity.this, "Bỏ check", Toast.LENGTH_SHORT).show();
                        }
                    }
                });



                builder.show();
            }
        });
    }

}
