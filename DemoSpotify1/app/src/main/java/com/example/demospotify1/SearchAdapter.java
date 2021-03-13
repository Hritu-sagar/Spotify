package com.example.demospotify1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {
    private List<Image> imageList;
    private ItemClickListener itemClickListener;

    public SearchAdapter(List<Image> imageList, ItemClickListener itemClickListener) {
        this.imageList = imageList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new SearchViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        Image image=imageList.get(position);
        holder.setData(image);
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
