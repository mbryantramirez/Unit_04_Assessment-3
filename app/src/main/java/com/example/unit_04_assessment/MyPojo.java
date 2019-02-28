package com.example.unit_04_assessment;

import java.util.ArrayList;

public class MyPojo
{
    private ArrayList<Message> message;

    private String status;



    public ArrayList<Message> getMessage ()
    {
        return message;
    }

    public void setMessage (ArrayList<Message> message)
    {
        this.message = message;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [message = "+message+", status = "+status+"]";
    }
}

