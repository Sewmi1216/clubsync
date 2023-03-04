package com.example.clubsync;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.clubsync.databinding.ActivityHomeBinding;
import androidx.appcompat.app.AppCompatActivity;
public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_explore, R.id.navigation_profile, R.id.navigation_news)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_home);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        button = (Button) findViewById(R.id.club1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile1Page();
            }
        });

        button = (Button) findViewById(R.id.club2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile2Page();
            }
        });

        button = (Button) findViewById(R.id.club3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile3Page();
            }
        });

        button = (Button) findViewById(R.id.club4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile4Page();
            }
        });

        button = (Button) findViewById(R.id.club5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile5Page();
            }
        });

        button = (Button) findViewById(R.id.club6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile6Page();
            }
        });

        button = (Button) findViewById(R.id.club7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenClubProfile7Page();
            }
        });
    }

    public  void OpenClubProfile1Page(){
        Intent intent = new Intent(this, ClubProfile1Activity.class);
        startActivity(intent);
    }
    public  void OpenClubProfile2Page(){
        Intent intent = new Intent(this, ClubProfile2Activity.class);
        startActivity(intent);
    }

    public  void OpenClubProfile3Page(){
        Intent intent = new Intent(this, ClubProfile3Activity.class);
        startActivity(intent);
    }

    public  void OpenClubProfile4Page(){
        Intent intent = new Intent(this, ClubProfile4Activity.class);
        startActivity(intent);
    }

    public  void OpenClubProfile5Page(){
        Intent intent = new Intent(this, ClubProfile5Activity.class);
        startActivity(intent);
    }

    public  void OpenClubProfile6Page(){
        Intent intent = new Intent(this, ClubProfile6Activity.class);
        startActivity(intent);
    }
    public  void OpenClubProfile7Page(){
        Intent intent = new Intent(this, ClubProfile7Activity.class);
        startActivity(intent);
    }
}