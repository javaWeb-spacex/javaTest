package com.spacex.www.base.enum1;

public enum Affirm {
    YES(1,"是"),
    NO(2,"否");
    private  Integer id;
    private  String text;

     Affirm(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }




    public String getText() {
        return text;
    }


}
