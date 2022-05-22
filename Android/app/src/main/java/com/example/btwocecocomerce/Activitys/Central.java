package com.example.btwocecocomerce.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btwocecocomerce.R;

public class Central extends AppCompatActivity {
    Button bt_disponiveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);

        bt_disponiveis = findViewById(R.id.bt_areaDisponiveis);
        confBotao();
    }
    public void confBotao(){
        this.bt_disponiveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}