package uk.ac.serc.customers;

public class Customer {

    String customerID;
    String companyName;
    String contactName;
    String contactTitle;
    String address;
    String city;
    String region;
    String postalCode;
    String country;
    String phone;
    String fax;

    public Customer() {
    }

    public Customer(String customerID, String companyName, String contactName, String contactTitle, String address,
            String city, String region, String postalCode, String country, String phone, String fax) {
        this.customerID = customerID;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    @Override
    public String toString() {
        return "customerID=" + customerID + "\n companyName=" + companyName + "\n contactName=" + contactName + "\n contactTitle=" + contactTitle + "\n city=" + city + "\n region=" + region + "\n country=" + country;
    }
    
    
    
    
}
