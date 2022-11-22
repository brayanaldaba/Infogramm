package com.example.myapplication.adapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Image;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    private  ArrayList<Image> images;
    private int resource;
    private Activity activity;
    public CardViewAdapter(ArrayList<Image> images, int resource, Activity activity){
this.images = images;
this.resource = resource;
this.activity =activity;
}

    @NonNull
    @NotNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CardViewHolder holder, int position) {
Image image= images.get()position;
//image
        Picasso.get().load(image.getUrlImagen()).into(holder.imageCardView);
        holder.usernameCardView.setText(image.getUsername());
        holder.cantidadDiasCardView.setText(image.getCantidadDias());
        holder.cantidadMeGustaCardView.setText(image.getCantidadMeGusta());
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class CardViewHolder estends RecyclerView.VireHolder {
        private ImageView imageCardView;
        private TextView usernameCardView;
        private TextView cantidadDiasCardView;
        private TextView cantidadMeGusta;
        public CardViewHolder(@NonNull View itemView){
            super(itemView);
            imageCardView = itemView.findViewById(R.id.imageCardView);
            usernameCardView = itemView.findViewById(R.id.usernameCardView);
            cantidadDiasCardView = itemView.findViewById(R.id.cantidaDiasCardView);
            cantidadMeGusta= itemView.findViewById(R,id,cantidadMeGustaCardView);
        }
    }
}
