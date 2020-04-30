package model;

/**
 * Created by Elimane on Apr, 2020, at 13:01
 */

public class Employee {
    private String firstName;
    private String lastName;
    private String cin;
    private float annualSalary;
    private Pays country;

    public Employee(String firstName, String lastName, String cin, float annualSalary, Pays country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.annualSalary = annualSalary;
        this.country = country;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public float getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }



    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Pays getCountry() {
        return country;
    }

    public void setCountry(Pays country) {
        this.country = country;
    }
}
