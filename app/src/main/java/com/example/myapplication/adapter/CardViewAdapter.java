package com.example.myapplication.adapter;
import android.app.Activity;
import android.app.ActivityOptions;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.model.Image;
import com.example.myapplication.view.ImageDetailActivity;

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
Image image= images.get(position);
//image
        Picasso.get().load(image.getUrlImagen()).into(holder.imageCardView);
        holder.usernameCardView.setText(image.getUsername());
        holder.cantidadDiasCardView.setText(image.getCantidadDias());
        holder.cantidadMeGustaCardView.setText(image.getCantidadMeGusta());
        //onclicklistener
        holder.imageCardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(activity, ImageDetailActivity.class);
                if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP){
                    Explode explode =new Explode();
                    explode.setFDuration(1000);
                    activity.getWindow().setExitTransition(explode);
                    activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, activity.getString(R.string.trasitionName_imageCardView)).toBundle());
                }
                }else{
                activity.startActivity(intent);
            }
        }
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
