package com.example.btwocecocomerce.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btwocecocomerce.Models.PlantCard;
import com.example.btwocecocomerce.R;

import java.util.ArrayList;

public class PlantCardAdapter extends RecyclerView.Adapter<PlantCardAdapter.MyViewHolder> {
    private ArrayList<PlantCard> plantas = new ArrayList<>();

    public PlantCardAdapter(ArrayList<PlantCard> plantas) {
        this.plantas = plantas;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recicler_item,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { //cria a visualização
        PlantCard plants = this.plantas.get(position);
        holder.tv1.setText(plants.getTv1());
        holder.tv2.setText(plants.getTv2());
        holder.tv3.setText(plants.getTv3());
        holder.tv4.setText(plants.getTv4());
        holder.imagem.setImageResource(R.drawable.plant);
        holder.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Visto "+ plants.getTv1(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.plantas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv1,tv2,tv3,tv4;
        private ImageView imagem;
        private Button bt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv_titulo);
            tv2 = itemView.findViewById(R.id.tv_descricao);
            tv3 = itemView.findViewById(R.id.tv_descricao2);
            tv4 = itemView.findViewById(R.id.tv_preco);
            imagem = itemView.findViewById(R.id.imv_planta);
            bt = itemView.findViewById(R.id.bt_comprar);
        }
    }
}
