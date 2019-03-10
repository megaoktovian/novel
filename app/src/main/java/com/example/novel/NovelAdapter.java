package com.example.novel;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.ViewHolder> {
    Context context;
    List<ModelNovel> modelNovels = new ArrayList<>();

    public NovelAdapter(Context context, List<ModelNovel> modelNovels){
        this.context = context;
        this.modelNovels = modelNovels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_view, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvName.setText(modelNovels.get(i).getName());
        viewHolder.imageView.setImageResource(modelNovels.get(i).getGambar());
        viewHolder.overview.setText(modelNovels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailNovelActivity.class);
                intent.putExtra("name", modelNovels.get(i).getName());
                intent.putExtra("gambar", modelNovels.get(i).getGambar());
               intent.putExtra("overview", modelNovels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, modelNovels.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelNovels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imageView;
        TextView overview;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            imageView = itemView.findViewById(R.id.iv_novel);
            overview = itemView.findViewById(R.id.tv_overview);
        }
    }
    }
