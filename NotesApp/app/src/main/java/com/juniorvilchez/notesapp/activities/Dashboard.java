package com.juniorvilchez.notesapp.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import com.juniorvilchez.notesapp.R;
import com.juniorvilchez.notesapp.fragments.FavoriteFragment;
import com.juniorvilchez.notesapp.fragments.HomeFragment;
import com.juniorvilchez.notesapp.fragments.SaveFragment;

public class Dashboard extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView bienvenida;
    private BottomNavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bienvenida = findViewById(R.id.bienvenida);
        bienvenida.setText("Welcome " + getIntent().getExtras().getString("user"));

        menu = findViewById(R.id.menu);
        menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item1:
                        fragment1();
                        break;

                    case R.id.item2:
                        fragment2();
                        break;

                    case R.id.item3:
                        fragment3();
                        break;
                }
                return false;
            }
        });

        fragment1();

    }

    private void fragment1(){
        Fragment hf = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, hf)
                .commit();
    }

    private void fragment2(){
        Fragment ff = new FavoriteFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, ff)
                .commit();
    }

    private void fragment3(){
        Fragment sf = new SaveFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content, sf)
                .commit();
    }
}
