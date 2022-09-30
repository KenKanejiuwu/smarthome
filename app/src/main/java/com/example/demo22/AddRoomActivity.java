package com.example.demo22;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

public class AddRoomActivity extends AppCompatActivity {

    EditText search = (EditText)findViewById(R.id.ed_text_room);

    ImageView kitchen = (ImageView) findViewById(R.id.imageKitchen);
    ImageView kitchen_bc = (ImageView) findViewById(R.id.bc1);
    ImageView bedroom = (ImageView) findViewById(R.id.imageBedroom);
    ImageView bedroom_bc = (ImageView) findViewById(R.id.bc2);
    ImageView bathroom = (ImageView) findViewById(R.id.imageBathroom);
    ImageView bathroom_bc = (ImageView) findViewById(R.id.bc3);
    ImageView office = (ImageView) findViewById(R.id.imageOffice);
    ImageView office_bc = (ImageView) findViewById(R.id.bc4);
    ImageView tv = (ImageView) findViewById(R.id.imageTv);
    ImageView tv_bc = (ImageView) findViewById(R.id.bc5);
    ImageView living = (ImageView) findViewById(R.id.imageLvRoom);
    ImageView living_bc = (ImageView) findViewById(R.id.bc6);
    ImageView garage = (ImageView) findViewById(R.id.imageGarage);
    ImageView garage_bc = (ImageView) findViewById(R.id.bc7);
    ImageView toilet = (ImageView) findViewById(R.id.imageToilet);
    ImageView toilet_bc = (ImageView) findViewById(R.id.bc8);
    ImageView kid = (ImageView) findViewById(R.id.imageKid);
    ImageView kid_bc = (ImageView) findViewById(R.id.bc9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
        
    }
}