package com.bogdantataru.abstractClass;

public class MyBook extends Book{

    public MyBook(){
        super();
    }

    @Override
    void setTitle(String s) {
        super.title = s;
    }

}
