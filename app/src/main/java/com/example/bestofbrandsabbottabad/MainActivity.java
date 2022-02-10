package com.example.bestofbrandsabbottabad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton button = (ImageButton) findViewById(R.id.furor_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Furor_Activity.class);
                startActivity(i);
            }
        });



        ImageButton button2 = (ImageButton) findViewById(R.id.outfitters_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(getApplicationContext(),Outfitters_Activity.class);
                startActivity(o);
            }
        });


        ImageButton button3 = (ImageButton) findViewById(R.id.one_btn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplicationContext(),One_Activity.class);
                startActivity(e);
            }
        });

        ImageButton button4 = (ImageButton) findViewById(R.id.cougars_btn);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v = new Intent(getApplicationContext(),Cougars_Activity.class);
                startActivity(v);
            }
        });

    }

}