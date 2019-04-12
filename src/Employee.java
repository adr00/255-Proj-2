/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drewk
 */
public class Employee extends Person{

    public Double salary;
    public Boolean ClockedIn;

    public Employee(String f, String l, String a, int aa, double s, Boolean c)
    {
        super(f,l,a,aa);
        ClockedIn = c;
        salary = s;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getClockedIn() {
        return ClockedIn;
    }

    public void setClockedIn(Boolean clockedIn) {
        ClockedIn = clockedIn;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

