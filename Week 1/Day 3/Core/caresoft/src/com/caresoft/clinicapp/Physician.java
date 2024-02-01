package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	private int physicianId;
	// TO DO: Constructor that takes an IDcopy
    // TO DO: Implement HIPAACompliantUser!
	 public Physician(int id) {
	        super();
	        this.patientNotes = new ArrayList<>();
	    }

	   
	    public boolean assignPIN(int pin) {
	        if (String.valueOf(pin).length() == 4) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    @Override
	    public boolean accessAuthorized(Integer id) {
	        return this.physicianId == id;
	    }

	    // Setters & Getters for physicianId and other variables
	    public void setPhysicianId(int physicianId) {
	        this.physicianId = physicianId;
	    }

	    public int getPhysicianId() {
	        return physicianId;
	    }
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
	
    // TO DO: Setters & Getters
}
