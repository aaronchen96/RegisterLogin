package com.example.registerlogin;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_search_pet:
                        Toast.makeText(HomeActivity.this, "Action Add Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_map:
                        Toast.makeText(HomeActivity.this, "Action Add Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_add:
                        Toast.makeText(HomeActivity.this, "Action Add Clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_profile:
                        Toast.makeText(HomeActivity.this, "Action Add Clicked", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      int id = item.getItemId();

      if(id== R.id.action_back) {
          Toast.makeText(getApplicationContext(), "Back clicked",
                  Toast.LENGTH_SHORT).show();
      }else if (id == R.id.action_chat){
          Toast.makeText(getApplicationContext(), "Chat clicked",
                  Toast.LENGTH_SHORT).show();

    }
    return true;
}

    private void setSupportActionBar(Toolbar toolbar) {
    }


}
