package com.LC.LCspringfev.Models;

import com.LC.LCspringfev.Area;

public class Team {

    //The representation of a team must be - it's ID - it's name - it's abreviation - it's country

    private String id;
    private String countryName;
    private String name;
    private String TLA;

    public Team(){
    }

    public Team(String id, String name, String TLA, String countryName) {
        this.id = id;
        this.countryName = countryName;
        this.name = name;
        this.TLA = TLA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTLA() {
        return TLA;
    }

    public void setTLA(String TLA) {
        this.TLA = TLA;
    }
}