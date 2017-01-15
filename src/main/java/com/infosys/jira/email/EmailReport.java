package com.infosys.jira.email;

import com.infosys.jira.helper.Browser;

/**
 * Created by Raj on 16/01/2017.
 */
public class EmailReport {

    private int serialNumber;
    private String userName;
    private String displayName;
    private Browser browser;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }
}
