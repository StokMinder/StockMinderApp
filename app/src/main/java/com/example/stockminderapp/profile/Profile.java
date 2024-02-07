package com.example.stockminderapp.profile;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.stockminderapp.MainActivity;
import com.example.stockminderapp.R;
import com.example.stockminderapp.movement.Movement;
import com.example.stockminderapp.profile.Help.Contact;
import com.example.stockminderapp.profile.Help.Faq;
import com.example.stockminderapp.report.Report;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btn_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                item -> {
                    int id = item.getItemId();
                    if (id == R.id.navigation_home) {
                        Intent intent = new Intent(Profile.this, MainActivity.class);
                        startActivity(intent);
                        return true;
                    } else if (id == R.id.navigation_report) {
                        Intent intent = new Intent(Profile.this, Report.class);
                        startActivity(intent);
                        return true;

                    } else if (id == R.id.navigation_movement) {
                        Intent intent = new Intent(Profile.this, Movement.class);
                        startActivity(intent);
                        return true;
                    } else if (id == R.id.navigation_help) {
                        Intent intent = new Intent(Profile.this, Faq.class);
                        startActivity(intent);
                        return true;
                    }
                    return false;
                });

    }
    public void navigation_edititem(View view) {
        Intent intent = new Intent(Profile.this, ViewEditItemActivity.class);
        startActivity(intent);
    }

    public void btn_back(View view) {
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
    }

    public void navigation_help(View view) {
        Intent intent = new Intent(Profile.this, Faq.class);
        startActivity(intent);
    }

}
