package com.example.unit_04_assessment;

import android.net.Uri;

public class Message
{
    private String image;

    private Uri wiki;

    private String animal;

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    public Uri getWiki ()
    {
        return wiki;
    }

    public void setWiki (Uri wiki)
    {
        this.wiki = wiki;
    }

    public String getAnimal ()
    {
        return animal;
    }

    public void setAnimal (String animal)
    {
        this.animal = animal;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [image = "+image+", wiki = "+wiki+", animal = "+animal+"]";
    }
}
