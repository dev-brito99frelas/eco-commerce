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

import com.example.btwocecocomerce.R;

public class PlantCardAdapter extends RecyclerView.Adapter<PlantCardAdapter.MyViewHolder> {
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recicler_item,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { //cria a visualização
        holder.tv1.setText("Planta Silvestre");
        holder.tv2.setText("Esta Planta possui xxxxxxxxxxxxxxxx!");
        holder.tv3.setText("Planta Silvestre encontrada em xxxxxxxxxxx!");
        holder.tv4.setText("R$ 5.50");
//        holder.imagem.setImageDrawable(R.drawable.ic_arrow_down_24);
        holder.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Visto", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
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
