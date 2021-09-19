package com.example.a8login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText pass;
    private Button btnLogin;
    private ImageView imageView;

    private static final String CorrectEmail = "dani@walla.com";
    private static final String CorrectPass = "12345";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Login();


    }
    public void Login(){
        email = findViewById( R.id.tvEmail );
        pass = findViewById( R.id.tvPass );
        btnLogin = findViewById( R.id.button2 );
        imageView = findViewById( R.id.imageView );

        btnLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CorrectEmail.equals(String.valueOf(email.getText() ))   && CorrectPass.equals(String.valueOf(pass.getText()))){
                    imageView.setImageResource( R.drawable.corect );
                }else {
                    imageView.setImageResource( R.drawable.wrong );
                }


            }
        } );






    }



}










