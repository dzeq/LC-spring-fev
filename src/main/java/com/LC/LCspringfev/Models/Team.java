package com.LC.LCspringfev.Models;

import com.LC.LCspringfev.Area;

public class Team {

    //The representation of a team must be - it's ID - it's name - it's abreviation - it's country

    private String id;
    private String countryName;
    private String name;
    private String TLA;
    private int creationYear;

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(String creationYear) {
        this.creationYear = Integer.parseInt(creationYear);
    }

    public Team(){
    }

    public Team(String id, String name, String TLA, String countryName, String creationYear) {
        this.id = id;
        this.countryName = countryName;
        this.name = name;
        this.TLA = TLA;
        this.creationYear = Integer.parseInt(creationYear);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", countryName='" + countryName + '\'' +
                ", name='" + name + '\'' +
                ", Abreviation='" + TLA + '\'' +
                ", creationYear='" + creationYear + '\'' +
                '}';
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
