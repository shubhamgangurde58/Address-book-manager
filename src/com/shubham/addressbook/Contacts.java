package com.shubham.addressbook;

public class Contacts {
    private String fName;
    private String lName;
    private String Address;
    private String State;
    private String City;
    private String Zip;
    private String phoneNo;
    private String email;

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setState(String state) {
        State = state;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return Address;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public String getZip() {
        return Zip;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", Address='" + Address + '\'' +
                ", State='" + State + '\'' +
                ", City='" + City + '\'' +
                ", Zip='" + Zip + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
