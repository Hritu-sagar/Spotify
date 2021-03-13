package com.example.demospotify1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private RecyclerView mrvRecyclerView;
    private List<Image> imageArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        buildData();
        setRecyclerAdapter();
    }

    private void setRecyclerAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        mrvRecyclerView.setLayoutManager(gridLayoutManager);

        SearchAdapter searchAdapter = new SearchAdapter(imageArrayList, this);
        mrvRecyclerView.setAdapter(searchAdapter);
    }

    private void buildData() {
        imageArrayList.add(new Image(R.drawable.alkayagni));
        imageArrayList.add(new Image(R.drawable.arijitsingh));
        imageArrayList.add(new Image(R.drawable.armaan));
        imageArrayList.add(new Image(R.drawable.himeshresamiya));
        imageArrayList.add(new Image(R.drawable.balasubramyam));
        imageArrayList.add(new Image(R.drawable.jagjeetsingh));
        imageArrayList.add(new Image(R.drawable.jubinnautiyal));


    }

    private void initView() {
        mrvRecyclerView = findViewById(R.id.rvRecyclerView);

    }

    @Override
    public void onClick(Image image) {
        Intent intent = new Intent(MainActivity.this, PlaySong.class);
        intent.putExtra("Image",image.getPicture());

        // intent.putExtra("song",image.getPicture());
        //intent.putExtra("song",image.getSong());
        startActivity(intent);
    }

}