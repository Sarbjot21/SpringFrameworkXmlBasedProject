package com.spring.model;

public class Nurse {
    String name;
    int nurseId;
    String qualification;
    boolean isAvailable;

    public Nurse(int id, String name) {
        this.name = name;
        this.nurseId = id;
    }

    public void assist() {
        System.out.println("Nurse is assisting");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
