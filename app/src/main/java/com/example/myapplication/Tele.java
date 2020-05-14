package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class Tele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);
        Button But = findViewById(R.id.button);

        But.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://doxy.me/davidcampopianonp?utm_source=Badge&utm_medium=Badge"));
                startActivity(intent);
            }
        });
    }
}
