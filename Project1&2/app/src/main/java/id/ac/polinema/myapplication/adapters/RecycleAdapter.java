package id.ac.polinema.myapplication.adapters;


import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.myapplication.R;
import id.ac.polinema.myapplication.models.Album;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    List<Album> albumList;

    public RecycleAdapter(List<Album> albumList) {
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public RecycleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View albumView = layoutInflater.inflate(R.layout.item_list,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(albumView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.MyViewHolder holder, int position) {
        Album album = albumList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.albumName.setText(album.getAlbumName());
        holder.image.setImageResource(album.getImage());
    }

    @Override
    public int getItemCount() {
        return (albumList != null) ? albumList.size() : 0;
//        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView albumName;
        public ImageView image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            albumName = itemView.findViewById(R.id.albumName);
            image = itemView.findViewById(R.id.albumImage);
        }
    }
}