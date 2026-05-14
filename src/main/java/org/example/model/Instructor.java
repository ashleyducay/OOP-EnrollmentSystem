package org.example.model;

public class Instructor extends Person {
    private String specialization;

    public Instructor() {
        super();
    }

    public Instructor(String personName, String personID, String specialization) {
        super(personID, personName);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getPersonName() {
        return super.getPersonName();
    }

    @Override
    public void mainTask() {
        System.out.println("Instructor is teaching modules.");
    }
}