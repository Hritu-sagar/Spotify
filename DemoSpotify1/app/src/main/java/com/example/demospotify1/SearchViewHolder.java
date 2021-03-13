package com.example.demospotify1;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class SearchViewHolder extends RecyclerView.ViewHolder {
private ImageView mIvImageView;
private CardView mCardView;
private ItemClickListener itemClickListener;

    public SearchViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        mIvImageView = itemView.findViewById(R.id.IvImage);
        mCardView = itemView.findViewById(R.id.CardView);


    }
    public void setData(Image image) {
        mIvImageView.setImageResource(image.getPicture());
        mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onClick(image);
            }
        });

    }


}
