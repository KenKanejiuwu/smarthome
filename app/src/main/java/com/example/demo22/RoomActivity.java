package com.example.demo22;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.hardware.lights.Light;
import android.os.Bundle;

import com.example.demo22.databinding.ActivityRoomBinding;
import com.example.demo22.fragments.HomeFragment;
import com.example.demo22.fragments.LightFragment;
import com.example.demo22.fragments.RoutinesFragment;
import com.example.demo22.fragments.SettingsFragment;
import com.example.demo22.fragments.StaticsFragment;
import com.example.demo22.fragments.ThermoFragment;

public class RoomActivity extends AppCompatActivity {

    ActivityRoomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRoomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new LightFragment());

        binding.TopNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.light_frame:
                    replaceFragment(new LightFragment());
                    break;
                case R.id.thermostat_frame:
                    replaceFragment(new ThermoFragment());
                    break;
            }
            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}