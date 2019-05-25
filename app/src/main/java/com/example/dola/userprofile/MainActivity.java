package com.example.dola.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView userprofile = findViewById(R.id.user_profile);
        userprofile.setImageResource(R.drawable.jazz);

        TextView name = findViewById(R.id.name);
        name.setText("Nom : Matthias");

        TextView birthday = findViewById(R.id.bithday);
        birthday.setText("Bithday: 14 - 05");

        TextView country = findViewById(R.id.country);
        country.setText("Country: Togo");
    }
}
