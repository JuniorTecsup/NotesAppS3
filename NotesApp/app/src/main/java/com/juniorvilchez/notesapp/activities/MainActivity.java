package com.juniorvilchez.notesapp.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.juniorvilchez.notesapp.R;
import com.juniorvilchez.notesapp.models.User;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnRegistrarse, btnIngresar;
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.editText_user);
        pass = findViewById(R.id.editText_pass);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnRegistrarse = findViewById(R.id.btnRegistrarse);

        //Registrarse
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        //Ingresar
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    //Activity Register
    private void register(){
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }

    //Loguearse
    private void login(){
        String us = user.getText().toString();
        String ps = pass.getText().toString();
        List<User> usuario = SugarRecord.find(User.class, "USERNAME = '"+ us +"' and  PASSWORD = '" + ps + "'");

        if (usuario.size()!=0){
            Intent i = new Intent(this, Dashboard.class);
            i.putExtra("user", usuario.get(0).getUser_full_name());
            startActivity(i);
        }
    }

}
