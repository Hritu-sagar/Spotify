package com.example.spotifyclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder> {


    private ArrayList<ParentModel> parentModelArrayList;

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> parentModelArrayList) {
        this.parentModelArrayList = parentModelArrayList;
    }

    public Context cxt;

   // public ParentRecyclerViewAdapter(ArrayList<ParentModel> parentModelArrayList, HomeFragment homeFragment) {
    //}

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView category;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.Song_Category);
            childRecyclerView = itemView.findViewById(R.id.Child_RV);
        }
    }

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> exampleList, Context context) {
        this.parentModelArrayList = exampleList;
        this.cxt = context;

    }


    @NonNull
    @Override
    public ParentRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ParentRecyclerViewAdapter.MyViewHolder holder, int position) {
        ParentModel currentItem = parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.category.setText(currentItem.SongCategory());
        ArrayList<ChildModel> arrayList = new ArrayList<>();

        // added the first child row
        if (parentModelArrayList.get(position).SongCategory().equals("Top Hindi Songs")) {
            arrayList.add(new ChildModel(R.drawable.ic_singer,"Hindi Song Name"));
            arrayList.add(new ChildModel(R.drawable.ic_shaan," Hindi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shankar,"Hindi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shreyasghosle,"Hindi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"Hindi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_neha,"Hindi Song Name"));
        }

        // added in second child row
        if (parentModelArrayList.get(position).SongCategory().equals("Top English Songs")) {
            arrayList.add(new ChildModel(R.drawable.ic_arijit,"English Song Name"));
            arrayList.add(new ChildModel(R.drawable.ic_shankar,"English Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shankar,"English Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shaan,"English Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shreys,"English Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_neha,"English Song Name"));
        }

        // added in third child row
        if (parentModelArrayList.get(position).SongCategory().equals("# Trending")) {
           arrayList.add(new ChildModel(R.drawable.ic_neha,"1"));
            arrayList.add(new ChildModel(R.drawable.ic_shreys,"2"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"3"));
            arrayList.add(new ChildModel( R.drawable.ic_shreyasghosle,"4"));
            arrayList.add(new ChildModel( R.drawable.ic_shreyasghosle,"5"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"6"));
        }

        // added in fourth child row
        if (parentModelArrayList.get(position).SongCategory().equals("Top Punjabi")) {
            arrayList.add(new ChildModel(R.drawable.ic_shankar,"Punjabi Song Name"));
            arrayList.add(new ChildModel(R.drawable.ic_singer,"Punjabi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"Punjabi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shaan,"Punjabi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_neha,"Punjabi Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shreyasghosle,"Punjabi Song Name"));
        }

        // added in fifth child row
        if (parentModelArrayList.get(position).SongCategory().equals("Top Devotional")) {
            arrayList.add(new ChildModel( R.drawable.ic_neha,"Devotional Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"Devotional Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"Devotional Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_neha,"Devotional Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shaan,"Devotional Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shankar,"Devotional Song Name"));
        }

        // added in sixth child row
        if (parentModelArrayList.get(position).SongCategory().equals("Top Mashup")) {
            arrayList.add(new ChildModel(R.drawable.ic_shaan,"Mashup Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shaan,"Mashup Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_arijit,"Mashup Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shreyasghosle,"Mashup Song Name"));
            arrayList.add(new ChildModel( R.drawable.ic_shreyasghosle,"Mashup Song Name"));
            arrayList.add(new ChildModel(R.drawable.ic_shreys,"Mashup Song Name"));
        }

        ChildRecyclerViewAdapter childRecyclerViewAdapter = new ChildRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }


}





