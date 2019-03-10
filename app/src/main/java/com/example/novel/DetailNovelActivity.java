package com.example.novel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailNovelActivity extends AppCompatActivity {
    TextView tvName, tvOverview;
    ImageView ivNovel;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        tvName = findViewById(R.id.tv_title);
        tvOverview = findViewById(R.id.tv_overview);
        ivNovel = findViewById(R.id.iv_novel);


        String name = getIntent().getStringExtra("name");
        String overview = getIntent().getStringExtra("overview");
        int gambar = getIntent().getIntExtra("gambar",0);

        tvName.setText(name);
        tvOverview.setText(overview);
        ivNovel.setImageResource(gambar);
    }
}
