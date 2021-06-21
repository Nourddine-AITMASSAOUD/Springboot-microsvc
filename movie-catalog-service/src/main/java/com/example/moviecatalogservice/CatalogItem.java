package com.example.moviecatalogservice;

public class CatalogItem {

    private String name;
    private String description;
    private int rate;


    public CatalogItem(String name, String description, int rate) {
        this.name = name;
        this.description = description;
        this.rate = rate;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    

    

}
