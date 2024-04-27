package com.example.uts;

public class Item {
    private String name;
    private String details;
    private int imageResourceId;

    public Item(String name, String details, int imageResourceId) {
        this.name = name;
        this.details = details;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDetailsWithImage() {
        return details + "\n\n" + "Gambar: " + imageResourceId;
    }

}
