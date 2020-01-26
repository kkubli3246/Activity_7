package com.example.photoapp;

import android.app.Application;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class MyAppliction extends Application {

    List<Uri> UriList = new ArrayList<>();

    public  MyAppliction(){
        this.UriList = new ArrayList<>();
    }

    public List<Uri> getUriList() {
        return UriList;
    }

    public void setUriList(List<Uri> uriList) {
        UriList = uriList;
    }
}
