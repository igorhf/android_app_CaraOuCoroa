package com.example.igor.cara_coroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private ImageView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (ImageView) findViewById(R.id.jogar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int rands = rand.nextInt(2);

                if (rands == 0){
                    startActivity(new Intent(MainActivity.this,CaraActivity.class));
                }else{
                    startActivity(new Intent(MainActivity.this,CoroaActivity.class));
                }
            }
        });
    }
}
