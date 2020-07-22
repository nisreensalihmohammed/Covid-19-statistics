package com.nso.coronavirustracker.model;

public class LocationStats {

    public String getState() {
        return state;
    }

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    private String counntry;

    public String getCounntry() {
        return counntry;
    }

    public void setCounntry(String counntry) {
        this.counntry = counntry;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    private int latestTotalCases;

    public int getDivFromPrevDay() {
        return divFromPrevDay;
    }

    public void setDivFromPrevDay(int divFromPrevDay) {
        this.divFromPrevDay = divFromPrevDay;
    }

    private int divFromPrevDay;

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", counntry='" + counntry + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
