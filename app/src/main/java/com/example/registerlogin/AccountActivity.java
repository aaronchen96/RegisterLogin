package com.example.registerlogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_search_pet:
                        Intent intent1 = new Intent(AccountActivity.this, HomeActivity.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_map:
                        Intent intent2 = new Intent(AccountActivity.this, LocationActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.action_add:
                        Intent intent3 = new Intent(AccountActivity.this, ListPetActivity.class);
                        startActivity(intent3);
                        break;
                    case R.id.action_profile:
                        Intent intent4 = new Intent(AccountActivity.this, AccountActivity.class);
                        startActivity(intent4);
                        break;
                }
                return true;
            }
        });
    }
}
