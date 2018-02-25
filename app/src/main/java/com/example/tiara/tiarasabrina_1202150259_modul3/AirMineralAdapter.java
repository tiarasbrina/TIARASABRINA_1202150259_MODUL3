package com.example.tiara.tiarasabrina_1202150259_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AirMineralAdapter extends RecyclerView.Adapter<AirMineralAdapter.MineralViewHolder>  {

    public ArrayList<ItemAirMineral> contains; //membuat variabel arraylist

    public AirMineralAdapter(ArrayList<ItemAirMineral>datas) {
        this.contains = datas; //mengatur isi dari contain adalah datas dari ItemAirMineral

        Log.d("JUMLAH_ARRAYLIST","Items "+getItemCount());
    }

    //memanggil method mineralviewhokder pada class ini
    @Override
    public AirMineralAdapter.MineralViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from((parent.getContext()));
        View view = layoutInflater.inflate(R.layout.activity_item_air_mineral,parent,false);
        return new MineralViewHolder(view);
    }
    @Override
    public void onBindViewHolder(AirMineralAdapter.MineralViewHolder holder, int position) {
        final ItemAirMineral item = contains.get(position);
        holder.bindTo(item);

        //membuat intent
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext().getApplicationContext(), DetailAirMineral.class);
                intent.putExtra("etitle", item.getNama());
                intent.putExtra("edesc", item.getDeskripsi());
                intent.putExtra("eimg", item.getGambar());
                view.getContext().startActivity(intent);
            }

        });
    }


    @Override
    public int getItemCount() {
        return contains.size();
    }

    class MineralViewHolder extends RecyclerView.ViewHolder{ //membuat view holder
        //membuat variable untuk menampung nilai dari textview, imageview, context
        private TextView mMinumanJudul;
        private TextView mMinumanInfo;
        private ImageView mMinumanImg;
        private Context mContext;
        private ItemAirMineral mCurrentAqua;

        //membuat konstrucktor
        public MineralViewHolder(View itemView) {
            super(itemView);
            mMinumanJudul = (TextView)itemView.findViewById(R.id.namaMerk);
            mMinumanInfo = (TextView)itemView.findViewById(R.id.deskripsiMerk);
            mMinumanImg = (ImageView) itemView.findViewById(R.id.Itemimage);

        }
        public void bindTo(ItemAirMineral aqua) {
            mCurrentAqua = aqua;
            mMinumanImg.setImageResource(aqua.getGambar());
            mMinumanJudul.setText(aqua.getNama());
            mMinumanInfo.setText(aqua.getInfo());
        }

    }
}
