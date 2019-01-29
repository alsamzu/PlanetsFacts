package com.example.planetsfacts.model;

import com.example.planetsfacts.R;

public class Story {
    private Page [] pages;

    public Story(){
        pages = new Page[8];

        pages[0]= new Page(R.string.page0);
        pages[1]= new Page(R.string.page1);
        pages[2]= new Page(R.string.page2);
        pages[3]= new Page(R.string.page3);
        pages[4]= new Page(R.string.page4);
        pages[5]= new Page(R.string.page5);
        pages[6]= new Page(R.string.page6);
        pages[7]= new Page(R.string.page7);


    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];
    }

}
