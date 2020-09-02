package com.chubasamuel.gads_2020;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView imageView=findViewById(R.id.image);
        imageView.setOnClickListener(
                view->{
                    Intent intent=new Intent(MainActivity.this,LeaderBoardActivity.class);
                    startActivity(intent);
                }
        );
            }
}
