package com.spring.model;

public class Doctor {
    String name;
    int id;
    String qualification;

    public Doctor(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name='" + name + '\'' + ", id=" + id + ", qualification='" + qualification + '\'' + '}';
    }

}
