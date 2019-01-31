package com.example.planetsfacts.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.planetsfacts.R;
import com.example.planetsfacts.model.Page;
import com.example.planetsfacts.model.Story;

public class StoryActivity extends AppCompatActivity {
        private    Story story;

        private   TextView storytextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        storytextview = (TextView) findViewById(R.id.StoryTextView);

        story = new Story();


        loadContent(4);

    }

    /*private void loadContent() {
    }
*/
    public   void loadContent(int pageNumber){
       final Page  page = story.getPage(pageNumber);

       String pageText =  getString(page.getTextId());
        pageText = String.format(pageText);

        //ADD NAME IF PLACEHOLDER IS INCLUDED WONT ADD IF NOT
        storytextview.setText(pageText);


    }


}
