package com.example.android.inclassassignment07_lindsayb;

public class Hike {

    private String place;
    private int miles;
    private boolean beenThere;

    public Hike(String place, int miles, boolean beenThere) {
        this.place = place;
        this.miles = miles;
        this.beenThere = beenThere;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public boolean isBeenThere() {
        return beenThere;
    }

    public void setBeenThere(boolean beenThere) {
        this.beenThere = beenThere;
    }

    @Override
    public String toString() {
        return "My Hiking Journey: " + "\n" +
                "place: " + place + '\n' +
                "miles: " + miles + '\n' +
                "I have been there: " + beenThere;
    }


}