package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public abstract class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    public AdminUser(int id, String role) {
        super();
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }

    
    public boolean assignPIN(int pin) {
        if (pin >= 100000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer id) {
        if (this.id.equals(id)) {
            return true;
        } else {
            authIncident();
            return false;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
