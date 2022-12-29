package com.example.groupproject;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList date_id, weight_id, bloodglucose_id, bloodpressure_id, temperature_id;

    public MyAdapter(Context context, ArrayList date_id, ArrayList weight_id, ArrayList bloodglucose_id, ArrayList bloodpressure_id, ArrayList temperature_id) {
        this.context = context;
        this.date_id = date_id;
        this.weight_id = weight_id;
        this.bloodglucose_id = bloodglucose_id;
        this.bloodpressure_id = bloodpressure_id;
        this.temperature_id = temperature_id;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userentry,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.date_id.setText(String.valueOf(date_id.get(position)));
        holder.weight_id.setText(String.valueOf(weight_id.get(position)));
        holder.bloodglucose_id.setText(String.valueOf(bloodglucose_id.get(position)));
        holder.bloodpressure_id.setText(String.valueOf(bloodpressure_id.get(position)));
        holder.temperature_id.setText(String.valueOf(temperature_id.get(position)));

    }

    @Override
    public int getItemCount() {
        return date_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date_id, weight_id, bloodglucose_id,bloodpressure_id,temperature_id;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            date_id = itemView.findViewById(R.id.textdate);
            weight_id = itemView.findViewById(R.id.textweight);
            bloodglucose_id = itemView.findViewById(R.id.textbloodglucose);
            bloodpressure_id = itemView.findViewById(R.id.textbloodpressure);
            temperature_id = itemView.findViewById(R.id.texttemperature);

        }
    }
}

