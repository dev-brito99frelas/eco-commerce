package com.example.btwocecocomerce.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.btwocecocomerce.Adapters.PlantCardAdapter;
import com.example.btwocecocomerce.Models.PlantCard;
import com.example.btwocecocomerce.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rc_novidades;
    private RecyclerView rc_mVendidos;
    private RecyclerView rc_custoBeneficio;
    private Button bt_pedidos,bt_comprados,bt_carrinho;
    private ArrayList<PlantCard> pl = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc_novidades = findViewById(R.id.rcv_novidades);
        rc_mVendidos = findViewById(R.id.rcv_maisvendidos);
        rc_custoBeneficio = findViewById(R.id.rcv_custoBeneficio);
        bt_pedidos = findViewById(R.id.bt_pedidos);
        bt_comprados = findViewById(R.id.bt_comprados);
        bt_carrinho = findViewById(R.id.bt_carrinho);
        fakeListPreenche();


        PlantCardAdapter adapter = new PlantCardAdapter(pl);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);
        rc_novidades.setLayoutManager(layoutManager);
        rc_novidades.setHasFixedSize(true);

        rc_novidades.setAdapter(adapter);


        RecyclerView.LayoutManager layoutManagerOne = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);
        rc_mVendidos.setLayoutManager(layoutManagerOne);
        rc_mVendidos.setHasFixedSize(true);

        rc_mVendidos.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManagerTwo = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);
        rc_custoBeneficio.setLayoutManager(layoutManagerTwo);
        rc_custoBeneficio.setHasFixedSize(true);
        rc_custoBeneficio.setAdapter(adapter);


    }
    public void fakeListPreenche(){
        String funcional = "Planta Z";
        String descricao = "Qualquer coisa falando sobre a planta";
        String preco = "R$ 4.89";
        for (int i = 0;i<100;i++){
            PlantCard card = new PlantCard(funcional+" #"+i,descricao,descricao,preco);
            this.pl.add(card);
        }

    }
}