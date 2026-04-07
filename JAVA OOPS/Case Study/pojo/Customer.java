package pojo;

import java.time.LocalDate;

public class Customer {
    private static int counter = 1;
    private int customerId;
    private String firstName, lastName, email, password;
    private double registrationAmount;
    private LocalDate dob;
    private ServicePlan plan;

    public Customer(String firstName, String lastName, String email, String password,
                    double regAmount, LocalDate dob, ServicePlan plan) {
        this.customerId = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.registrationAmount = regAmount;
        this.dob = dob;
        this.plan = plan;
    }

    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public LocalDate getDob() { return dob; }
    public ServicePlan getPlan() { return plan; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return customerId + " " + firstName + " " + lastName + " " +
               email + " " + plan + " " + dob;
    }
}