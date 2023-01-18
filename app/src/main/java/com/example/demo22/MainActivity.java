package com.example.demo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.demo22.databinding.ActivityMainBinding;
import com.example.demo22.fragments.HomeFragment;
import com.example.demo22.fragments.RoutinesFragment;
import com.example.demo22.fragments.SettingsFragment;
import com.example.demo22.fragments.StaticsFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        ImageView add = (ImageView) findViewById(R.id.add_image);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddRoomActivity.class);
                startActivity(intent);
            }
        });

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.home_frame:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.statics_frame:
                    replaceFragment(new StaticsFragment());
                    break;
                case R.id.routines_frame:
                    replaceFragment(new RoutinesFragment());
                    break;
                case R.id.setting_frame:
                    replaceFragment(new SettingsFragment());
                    break;
            }

            return true;
            });
        }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}