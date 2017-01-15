package com.infosys.jira.helper;

/**
 * Created by Raj on 15/01/2017.
 */
public enum Browsers {

    CHROME("Chrome"),
    MSIE("Internet Explorer"),
    SAFARI("Safari"),
    FIREFOX("Firefox"),
    UNKNOWN("Unknown");

    private String name;

    public String getName() {
        return name;
    }

    private Browsers(String name) {
        this.name = name;
    }


}
