package com.uwork.uwork3;


public class Info {

    String info;
    String description;
    String time;

    public Info(String info,String desc,String time){
        this.info=info;
        description=desc;
        this.time=time;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getInfo() {
        return info;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }
}