package org.example;

public class Employee {
    private long id;
    private long phoneNumber;
    private String name;
    private double seniority;

    public Employee(long ID, long phoneNumber, String name, double seniority) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.seniority = seniority;
    }

    public long getId() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    public String toString() {
        return String.format("ID - %d | Name - %s | PhoneNumber - %d | Seniority - %d\n", id, name, phoneNumber, seniority);
    }
}
