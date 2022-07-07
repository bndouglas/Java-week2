package uk.ac.serc.customers;

import java.util.Date;

public class Employee {
    Integer employeeID;
    String lastName;
    String firstName;
    String title;
    String titleOfCourtesy;
    Date birthDate;
    Date hireDate;
    String address;
    String city;
    String region;
    String postalCode;
    String country;
    String homePhone;
    String extension;
    Integer reportsTo;

    public Employee() {
    }

    public Employee(Integer employeeID, String lastName, String firstName, String title, String titleOfCourtesy,
            Date birthDate, Date hireDate, String address, String city, String region, String postalCode,
            String country, String homePhone, String extension, Integer reportsTo) {
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.reportsTo = reportsTo;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Integer getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", birthDate=" + birthDate + ", city=" + city + ", country=" + country
                + ", employeeID=" + employeeID + ", extension=" + extension + ", firstName=" + firstName + ", hireDate="
                + hireDate + ", homePhone=" + homePhone + ", lastName=" + lastName + ", postalCode=" + postalCode
                + ", region=" + region + ", reportsTo=" + reportsTo + ", title=" + title + ", titleOfCourtesy="
                + titleOfCourtesy + "]";
    }
    
    
    
    

}
