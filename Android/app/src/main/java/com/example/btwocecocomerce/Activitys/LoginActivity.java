package com.example.btwocecocomerce.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btwocecocomerce.MainActivity;
import com.example.btwocecocomerce.R;

public class LoginActivity extends AppCompatActivity {
    private Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.entrar = findViewById(R.id.bt_entrar);
        configButtonEntrar();
    }
    public void  configButtonEntrar(){
        this.entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}