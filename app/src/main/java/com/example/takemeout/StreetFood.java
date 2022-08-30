package com.example.takemeout;

import android.content.Intent;
import android.os.Bundle;


import com.example.takemeout.stores.food.Brothers;
import com.example.takemeout.stores.food.Estrella;
import com.example.takemeout.stores.food.Falafel;
import com.example.takemeout.stores.food.KritikoPerivoli;
import com.example.takemeout.stores.food.MpougatsaGiannis;
import com.example.takemeout.stores.food.PizzaChris;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StreetFood extends AppCompatActivity implements Adapter.OnPlaceListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_list);





        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist=new ArrayList<>();
        mlist.add(new item(R.drawable.estrella,"Estrella","Π. Μελά 48"));
        mlist.add(new item(R.drawable.falafel,"Falafel Taste Middle East","Μητροπόλεως 106"));
        mlist.add(new item(R.drawable.brothers,"Brothers In Law","Π. Μελά 30"));
        mlist.add(new item(R.drawable.kritiko,"Το Κρητικό Περιβόλι","Δημητρίου Γούναρη 42"));
        mlist.add(new item(R.drawable.pizzachris,"Pizza Chris ","Αρμενοπούλου 17 "));
        mlist.add(new item(R.drawable.mpougatsa,"Μπουγάτσα Γιάννης","Μητροπόλεως 106"));



        Adapter adapter=new Adapter(this,mlist,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onPlaceClick(int position) {
        Intent intent;
        if (position == 0) {
            intent = new Intent(this, Estrella.class);
        } else if (position == 1) {
            intent = new Intent(this, Falafel.class);
        } else if (position == 2) {
            intent = new Intent(this, Brothers.class);
        } else if (position==3) {
            intent = new Intent(this, KritikoPerivoli.class);
        } else if (position==4) {
            intent = new Intent(this, PizzaChris.class);
        }
        else {
            intent=new Intent(this, MpougatsaGiannis.class);
        }

        startActivity(intent);

    }
}
