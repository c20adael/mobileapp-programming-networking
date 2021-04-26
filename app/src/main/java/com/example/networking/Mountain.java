package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;


    public Mountain (String n, String l, int h) {
        name=n;
        location=l;
        height=h;
    }


    public String info(){
        String tmp = new String();
        tmp+=name+" is located in mountain range "+location+"and reaches "+height+"m above sea level.";
        return tmp;
    }

    @Override
    public String toString(){
        return name;
    }
}






