package com.example.takemeout;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {
    Context mContext;
    List<item> mData;
    private OnPlaceListener mOnPlaceListener ;

    public Adapter(Context mContext, List<item> mData,OnPlaceListener mOnPlaceListener) {
        this.mContext = mContext;
        this.mData = mData;
        this.mOnPlaceListener=mOnPlaceListener;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item,parent,false);
        return new myViewHolder(v,mOnPlaceListener);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.titlos_magaziou.setText(mData.get(position).getTitlosMagaziou());
        holder.odos_magaziou.setText(mData.get(position).getOdosMagaziou());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView background_img;
        TextView titlos_magaziou, odos_magaziou;
        OnPlaceListener onPlaceListener;


        public myViewHolder(View itemView,OnPlaceListener onPlaceListener) {
            super(itemView);
            background_img = itemView.findViewById(R.id.card_background);
            titlos_magaziou = itemView.findViewById(R.id.card_title);
            odos_magaziou = itemView.findViewById(R.id.card_nb);
            this.onPlaceListener = onPlaceListener;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            onPlaceListener.onPlaceClick(getAdapterPosition());
        }
    }

        public interface OnPlaceListener{
            void onPlaceClick(int position);
        }




}
