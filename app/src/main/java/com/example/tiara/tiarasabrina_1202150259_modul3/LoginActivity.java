package com.example.tiara.tiarasabrina_1202150259_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //membuat variabel yang akan menampung nilai dari edit text dan button
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); //login activity menggunakan content dari layoutc activity_login

        //menemukan id username dan password pada layout
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

    }

    public void btnLogin (View view){
        //mengambil nilai dan menyimpannya di variable
        final String usernamekey = username.getText().toString();
        final String passwordkey = password.getText().toString();

        //membuat kondisi jika field username = EAD dan field password = EAD maka masuk
        if ((usernamekey.equals("EAD") && passwordkey.equals("MOBILE"))) { //Jika user dan password benar
            Intent intent = new Intent(LoginActivity.this, DaftarAirMineral.class);
            startActivity(intent);
            Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_LONG).show();
        }

        //membuat kondisi jika salah satu field kosong maka akan muncul allert dialog
        else if (usernamekey.isEmpty() || passwordkey.isEmpty() ){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Alert Message");
            alert.setMessage("Username/Password Kosong, Isi Terlebih Dahulu!")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }

        //kondisi jika selain kondisi diatas
        else {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Login Gagal");
            alert.setMessage("Username & Password Salah")
                    .setCancelable(false)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();

        }

}}