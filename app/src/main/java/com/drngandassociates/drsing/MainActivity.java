package com.drngandassociates.drsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(R.drawable.photo);

        TextView title = (TextView) findViewById(R.id.title);
        title.setText(R.string.title);

        TextView subtitle = (TextView) findViewById(R.id.subtitle);
        subtitle.setText(R.string.subtitle);

        TextView officeOne = (TextView) findViewById(R.id.office_one);
        officeOne.setText(R.string.office_one);

        TextView officeTwo = (TextView) findViewById(R.id.office_two);
        officeTwo.setText(R.string.office_two);

    }
}
