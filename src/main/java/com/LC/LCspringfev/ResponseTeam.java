package com.LC.LCspringfev;

public class ResponseTeam {
    private String name;
    private String founded;
    private String ID;
    private String tla;
    private Area area;

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public ResponseTeam() {}

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ResponseTeam{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", tla='" + tla + '\'' +
                ", area=" + area +
                ", creationYear=" + founded +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTLA() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }
}
