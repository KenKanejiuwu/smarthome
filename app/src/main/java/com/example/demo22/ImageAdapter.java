package com.example.demo22;

public class ImageAdapter {
    String mDrawableName = "p" + position;
    int resID = imageView.getContext().getResources().getIdentifier(mDrawableName , "drawable", imageView.getContext().getPackageName());
    imageView.setImageResource(resID);
}
