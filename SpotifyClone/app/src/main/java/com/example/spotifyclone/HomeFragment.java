package com.example.spotifyclone;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private RecyclerView parentRecyclerView;
    private RecyclerView.Adapter ParentAdapter;
    ArrayList<ParentModel> parentModelArrayList = new ArrayList<>();
    private RecyclerView.LayoutManager parentLayoutManager;


     public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        parentModelArrayList.add(new ParentModel("Top Hindi Songs"));
        parentModelArrayList.add(new ParentModel("Top English Songs"));
        parentModelArrayList.add(new ParentModel("# Trending"));
        parentModelArrayList.add(new ParentModel("Top Punjabi"));
        parentModelArrayList.add(new ParentModel("Top Devotional"));
        parentModelArrayList.add(new ParentModel("Top Mashup"));
        parentRecyclerView = view.findViewById(R.id.Parent_recyclerView);
        parentRecyclerView.setHasFixedSize(true);
        parentLayoutManager = new LinearLayoutManager(getContext());
        ParentAdapter = new ParentRecyclerViewAdapter(parentModelArrayList, getContext());
        parentRecyclerView.setLayoutManager(parentLayoutManager);
        parentRecyclerView.setAdapter(ParentAdapter);
        ParentAdapter.notifyDataSetChanged();
    }
}







