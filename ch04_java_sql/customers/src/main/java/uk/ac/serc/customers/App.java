package uk.ac.serc.customers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //=========================================================
        // Customers
        // ========================================================

        // ArrayList<Customer> customerList = getAllCustomers();

        // System.out.print("Which country would you like customers for? > ");
        // Scanner sc = new Scanner(System.in);
        // String response = sc.nextLine();

        // for (Customer customer : customerList){
        //     if (response.equals(customer.country)){
        //         System.out.println(customer);
        //     }
        // }
        
        //=========================================================
        // Employees
        // ========================================================

        ArrayList<Employee> employeeList = getAllEmployees();

        System.out.print("Which Employee would you like? > ");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        Integer desiredEmployee = Integer.parseInt(response);

        for (Employee employee : employeeList){
            if (desiredEmployee == employee.employeeID){
                System.out.println(employee);
            }
        }


    }

    private static ArrayList<Customer> getAllCustomers(){

        String databaseName = "cf-training-db-server";
        String url = databaseName + ".database.windows.net";
        String database = "northwind";
        String user = "cf_readonly_login";
        String password = "BDtrp7ajxtzoMpF4WN4rGDrfIDAc0xIy";
        String connectionUrl = "jdbc:sqlserver://" + url + ":1433;databaseName=" + database + ";user="+ user + ";password=" + password +";";
    
        System.out.println(connectionUrl);

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("-- Connected to the database. --");

                String sql = "SELECT * FROM Customers;";
                try (Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        
                        Customer customer = new Customer();
                        customer.customerID = resultSet.getString("CustomerID");
                        customer.companyName = resultSet.getString("CompanyName");
                        customer.contactName = resultSet.getString("ContactName");
                        customer.contactTitle = resultSet.getString("ContactTitle");
                        customer.address = resultSet.getString("Address");
                        customer.city = resultSet.getString("City");
                        customer.region = resultSet.getString("Region");
                        customer.postalCode = resultSet.getString("PostalCode");
                        customer.country = resultSet.getString("Country");
                        customer.phone = resultSet.getString("Phone");
                        customer.fax = resultSet.getString("Fax");

                        customerList.add(customer);

                    }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

        return customerList;

    }

    private static ArrayList<Employee> getAllEmployees(){

        String databaseName = "cf-training-db-server";
        String url = databaseName + ".database.windows.net";
        String database = "northwind";
        String user = "cf_readonly_login";
        String password = "BDtrp7ajxtzoMpF4WN4rGDrfIDAc0xIy";
        String connectionUrl = "jdbc:sqlserver://" + url + ":1433;databaseName=" + database + ";user="+ user + ";password=" + password +";";
    
        System.out.println(connectionUrl);

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("-- Connected to the database. --");

                String sql = "SELECT * FROM Employees;";
                try (Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {

                        
                        Employee employee = new Employee();
                        employee.employeeID = resultSet.getInt("EmployeeID");
                        employee.lastName = resultSet.getString("LastName");
                        employee.firstName = resultSet.getString("FirstName");
                        employee.title = resultSet.getString("Title");
                        employee.titleOfCourtesy = resultSet.getString("TitleOfCourtesy");
                        employee.birthDate = resultSet.getDate("BirthDate");
                        employee.hireDate = resultSet.getDate("HireDate");
                        employee.address = resultSet.getString("Address");
                        employee.city = resultSet.getString("City");
                        employee.region = resultSet.getString("Region");
                        employee.postalCode = resultSet.getString("PostalCode");
                        employee.country = resultSet.getString("Country");
                        employee.homePhone = resultSet.getString("HomePhone");
                        employee.extension = resultSet.getString("Extension");
                        employee.reportsTo = resultSet.getInt("ReportsTo");

                        employeeList.add(employee);

                    }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }

        return employeeList;

    }

}
