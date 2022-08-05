package com.example.myapplication;

public class ItemGrid {

    String listName;
    int listImage;

    public ItemGrid(String abName,int abImage)
    {
        this.listImage=abImage;
        this.listName=abName;
    }
    public String getabName()
    {
        return listName;
    }

    public void setListName(int listImage) {
        this.listImage = listImage;
    }

    public int getabImage()
    {
        return listImage;
    }

    public void setListImage(String listName) {
        this.listName = listName;
    }
}


