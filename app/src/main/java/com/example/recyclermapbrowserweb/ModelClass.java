package com.example.recyclermapbrowserweb;

public class ModelClass {
    String tpname,mobilenumber,link;
    int downarrow,call,map,browse,timage;
    double latitude,longitude;
    boolean expand;



    public ModelClass(int timage, String tpname, int downarrow, int call, int map, int browse, String mobilenumber,double latitude,double longitude,String link) {
        this.timage = timage;
        this.tpname = tpname;
        this.downarrow = downarrow;
        this.call = call;
        this.map = map;
        this.browse = browse;
        this.mobilenumber=mobilenumber;
        this.latitude=latitude;
        this.longitude=longitude;
        this.link=link;
        this.expand=false;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getTpname() {
        return tpname;
    }

    public void setTpname(String tpname) {
        this.tpname = tpname;
    }

    public int getDownarrow() {
        return downarrow;
    }

    public void setDownarrow(int downarrow) {
        this.downarrow = downarrow;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }

    public int getTimage() {
        return timage;
    }

    public void setTimage(int timage) {
        this.timage = timage;
    }

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }
}
