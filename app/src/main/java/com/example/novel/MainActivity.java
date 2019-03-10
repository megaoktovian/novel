package com.example.novel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView  {
    RecyclerView recyclerView, recyclerViewA, recyclerViewB;
    NovelAdapter adapter;
    NovelPresenter presenter;
    List<ModelNovel> modelNovels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NovelAdapter(this, modelNovels);
        recyclerView.setAdapter(adapter);
        presenter = new NovelPresenter(this, this);
        presenter.setData();
        recyclerViewA = findViewById(R.id.recyclerview_H);
        recyclerViewA.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        adapter = new NovelAdapter(this, modelNovels);
        recyclerViewA.setAdapter(adapter);
        presenter = new NovelPresenter(this, this);
        presenter.setData();
        recyclerViewB = findViewById(R.id.recyclerview_G);
        recyclerViewB.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new NovelAdapter(this, modelNovels);
        recyclerViewB.setAdapter(adapter);
        presenter = new NovelPresenter(this, this);
        presenter.setData();

    }


    @Override
    public void onSucsess(List<ModelNovel> modelNovels) {
        this.modelNovels.clear();
        this.modelNovels.addAll(modelNovels);
        this.adapter.notifyDataSetChanged();
    }

}
