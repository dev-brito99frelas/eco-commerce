package com.example.btwocecocomerce.Activitys;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btwocecocomerce.Adapters.PlantCardAdapter;
import com.example.btwocecocomerce.Models.PlantCard;
import com.example.btwocecocomerce.R;
import com.example.btwocecocomerce.databinding.ActivityMain2Binding;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView rc_mVendidos;
    private RecyclerView rc_custoBeneficio;
    private Button bt_pedidos,bt_comprados,bt_carrinho;
    private ArrayList<PlantCard> pl = new ArrayList<>();

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        // # Recicler views
        RecyclerView rc_novidades = findViewById(R.id.rcv_novidades);
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

    // all itens
    public void fakeListPreenche(){
        String funcional = "Planta Z";
        String descricao = "Qualquer coisa falando sobre a planta";
        String preco = "R$ 4.89";
        for (int i = 0;i<100;i++){
            PlantCard card = new PlantCard(funcional+" #"+i,descricao,descricao,preco);
            this.pl.add(card);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}