package com.juniorvilchez.notesapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.juniorvilchez.notesapp.R;
import com.juniorvilchez.notesapp.models.User;
import com.orm.SugarRecord;

public class Register extends AppCompatActivity {

    private EditText regUserName, regUserFull, regUserEmail, regUserPass;
    private Button btnRegisterComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        regUserName = findViewById(R.id.regUserName);
        regUserFull = findViewById(R.id.regUserFull);
        regUserEmail = findViewById(R.id.regUserEmail);
        regUserPass = findViewById(R.id.regUserPass);
        btnRegisterComplete = findViewById(R.id.btnRegisterComplete);
        btnRegisterComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUser();
            }
        });

    }

    //Registra al usuario en la base de datos
    private void registrarUser(){
        String username = regUserName.getText().toString();
        String fullname = regUserFull.getText().toString();
        String email =    regUserEmail.getText().toString();
        String pass =     regUserPass.getText().toString();

        User user = new User(username, fullname, email, pass);
        SugarRecord.save(user);
        Log.i("Registrado correctamente----> ", SugarRecord.findById(User.class, 1).getUser_name());
        finish();
    }

}
