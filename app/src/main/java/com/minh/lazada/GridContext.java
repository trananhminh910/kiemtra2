package com.minh.lazada;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GridContext extends AppCompatActivity {
    TextView textContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_context);
        textContext=findViewById(R.id.textContext);
        Intent intent=this.getIntent();

        textContext.setText(intent.getStringExtra("noidung"));
    }
}
