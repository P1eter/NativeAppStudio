package com.example.pieter.pieterkronemeijer_pset1;

import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Create bundle when onSaveInstanceState is called. */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("hat",(findViewById(R.id.imageViewHat)).getVisibility());
        outState.putInt("mustache",(findViewById(R.id.imageViewMustache)).getVisibility());
        outState.putInt("eyes",(findViewById(R.id.imageViewEyes)).getVisibility());
        outState.putInt("ears",(findViewById(R.id.imageViewEars)).getVisibility());
        outState.putInt("eyebrows",(findViewById(R.id.imageViewEyebrows)).getVisibility());
        outState.putInt("nose",(findViewById(R.id.imageViewNose)).getVisibility());
        outState.putInt("mouth",(findViewById(R.id.imageViewMouth)).getVisibility());
        outState.putInt("shoes",(findViewById(R.id.imageViewShoes)).getVisibility());
        outState.putInt("glasses",(findViewById(R.id.imageViewGlasses)).getVisibility());
        outState.putInt("arms",(findViewById(R.id.imageViewArms)).getVisibility());
    }

    /* Restore image visibility that is stored in a bundle. */
    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        findViewById(R.id.imageViewHat).setVisibility(inState.getInt("hat"));
        findViewById(R.id.imageViewEyes).setVisibility(inState.getInt("eyes"));
        findViewById(R.id.imageViewEars).setVisibility(inState.getInt("ears"));
        findViewById(R.id.imageViewNose).setVisibility(inState.getInt("nose"));
        findViewById(R.id.imageViewMouth).setVisibility(inState.getInt("mouth"));
        findViewById(R.id.imageViewGlasses).setVisibility(inState.getInt("glasses"));
        findViewById(R.id.imageViewEyebrows).setVisibility(inState.getInt("eyebrows"));
        findViewById(R.id.imageViewMustache).setVisibility(inState.getInt("mustache"));
        findViewById(R.id.imageViewArms).setVisibility(inState.getInt("arms"));
        findViewById(R.id.imageViewShoes).setVisibility(inState.getInt("shoes"));


    }

    /* Change the image visibility of an image corresponding to a certain checkbox. */
    public void buttonClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        int image_id = getImageID(view.getId());
        changeChecked(checked, image_id);
    }

    /* Get the image ID when given the ID of a checkbox. */
    private int getImageID(int viewID) {
        switch(viewID) {
            case R.id.eyes:
                return R.id.imageViewEyes;
            case R.id.eyebrows:
                return R.id.imageViewEyebrows;
            case R.id.mouth:
                return R.id.imageViewMouth;
            case R.id.hat:
                return R.id.imageViewHat;
            case R.id.shoes:
                return R.id.imageViewShoes;
            case R.id.ears:
                return R.id.imageViewEars;
            case R.id.nose:
                return R.id.imageViewNose;
            case R.id.mustache:
                return R.id.imageViewMustache;
            case R.id.arms:
                return R.id.imageViewArms;
            case R.id.glasses:
                return R.id.imageViewGlasses;
        }
        return R.id.imageViewHat;
    }

    /* Change the visibility of an image with given ID based on the 'checked' boolean. */
    private void changeChecked(boolean checked, int image_id) {
        ImageView img = findViewById(image_id);
        if (checked) {
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.INVISIBLE);
        }
    }
}
