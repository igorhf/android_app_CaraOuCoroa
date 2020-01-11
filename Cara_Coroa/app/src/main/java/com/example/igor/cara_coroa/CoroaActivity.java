package com.example.igor.cara_coroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CoroaActivity extends AppCompatActivity {

    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coroa);

        voltar = (ImageView) findViewById(R.id.voltar_coroa);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoroaActivity.this,MainActivity.class));
            }
        });
    }
}
