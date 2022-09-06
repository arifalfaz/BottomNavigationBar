package com.example.bottomnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomnavigationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.brain);
        getSupportActionBar().setTitle("Search");




        bottomnavigationview = findViewById(R.id.bottomnavigationview);
        bottomnavigationview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.workout:
                        Toast.makeText(MainActivity.this, "Workout", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.healthcare:
                        Toast.makeText(MainActivity.this, "Healthcare", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.meditation:
                        Toast.makeText(MainActivity.this, "Meditation", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.affermation:
                        Toast.makeText(MainActivity.this, "Affermation", Toast.LENGTH_SHORT).show();


                }

                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type here to Search");

        return super.onCreateOptionsMenu(menu);

    }

}

