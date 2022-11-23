package com.example.myapplication.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapter.CardViewAdapter;
import com.example.myapplication.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //toolbar
        showToolBar("", false, view);
//recyclerview
        View view = inflater.inflate(R.layout.fragment_profile,container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view_profile);
        //layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(),R.layout.cardview_image,getActivity());
        recyclerView.setAdapter(cardViewAdapter);
        return view;
    }
        public void shoetoolBar(String titulo, boolean botonSubir){
            Toolbar toolbar = findViewById(R.id.toolbar_profile);
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
            ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);


        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
    //creamos la lista de imagenes
    public ArrayList<Image> buidImages (){
        ArrayList<Image> images =ArrayList<>();
        images.add(new Image(urlImagen:"https://antipode-bolivia.com/photo/virgen-del-socavon-1.jpeg",username:"Carlos Valdivia", cantidadDias:"3 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.4679d40ff6e3cf80f1b643e650450f3b?rik=xKYQIr%2fK5PZzGw&pid=ImgRaw&r=0",username:"Luis Perez", cantidadDias:"6 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.6c8f49e4e50d8bec204aa77f4c7f447b?rik=fEUBnn45T9kiKg&pid=ImgRaw&r=0",username:"Fernando torrico", cantidadDias:"5 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.93fa896a0bac6f9209e22df1253d7b1f?rik=yXWpCySheT51Nw&pid=ImgRaw&r=0",username:"Maria Flores", cantidadDias:"3 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.f409aed759ac25eb9444ba28e10326f0?rik=J4Fw6Tb1LClTUA&pid=ImgRaw&r=0",username:"Rolando Morales", cantidadDias:"4 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://d3pysz1w5jtrov.cloudfront.net/files/6/6/3/0/5/3/zonnepoort-Inti-punku-Tiwanaku-Bolivia_1_350362.jpg?height=&width=960",username:"William Jaimes", cantidadDias:"2 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.1c2abe27a2aee3268d8d18db0476e9eb?rik=ndkBPATBbZM0eA&pid=ImgRaw&r=0",username:"Roberto Paniagua", cantidadDias:"2 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.b06b252f0345dc1a7ce7115c759ed215?rik=cLLjzHjRvmST8A&riu=http%3a%2f%2fqueverenz.com%2fwp-content%2fuploads%2f2016%2f11%2fQue-cosas-ver-hacer-en-bolivia-lugares-sitios-puntos-destinos-turismo-dias.jpg&ehk=%2bONsLaj60m8Ij47bkHwCXTKQkWGZtbxXEPUoI%2b69ixY%3d&risl=&pid=ImgRaw&r=0",username:"Carlos Valdivia", cantidadDias:"2 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.4315953d8bf201bc20fb1be6dc627b76?rik=r4%2b1PE5TFAxFtg&riu=http%3a%2f%2ffqz2.web.fc2.com%2f2-my%2fkaigai%2f2008.6peru%2fp-5%2fimage%2fTA1_0132.jpg&ehk=0I5LlIzmghq%2bEVXhndVn6SCBTJKJjP%2ffoZscOFHFOIU%3d&risl=&pid=ImgRaw&r=0",username:"Lorena Herrera", cantidadDias:"6 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.850492872d64fdc91b6831b501cc9a0d?rik=59xVnPNQdeHOOQ&riu=http%3a%2f%2f1.bp.blogspot.com%2f-euaAkor5FTU%2fVkHgHdZXMDI%2fAAAAAAAAAFw%2f8eUiNl6LQao%2fs1600%2fjaguar.jpg&ehk=DfzHzp%2bM72fISgFnkMTZnd%2bOqXWt5Mn%2ffiNBBobdBBE%3d&risl=&pid=ImgRaw&r=0",username:"Laura Caceres", cantidadDias:"9 dias", cantidadMeGusta:"1 me gusta"));
        images.add(new Image(urlImagen:"https://th.bing.com/th/id/R.6b1978796668a970fa290951a5efbbea?rik=pAm3XTfFa4Gzrg&pid=ImgRaw&r=0   ",username:"Marcelo Rojas", cantidadDias:"2 dias", cantidadMeGusta:"1 me gusta"));



    }

}