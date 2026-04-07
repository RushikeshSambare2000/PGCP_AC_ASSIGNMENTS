package service;

import java.time.LocalDate;
import java.util.*;
import exception.CustomerException;
import pojo.*;
import validation.CustomerValidationRules;

public class CustomerOperationsImpl implements CustomerOperations {

    private Map<String, Customer> customerMap = new HashMap<>();

    @Override
    public void signUp(String fn, String ln, String email, String pass,
                       double amt, String dob, String plan)
            throws CustomerException {

        ServicePlan sp = CustomerValidationRules.parsePlan(plan);
        CustomerValidationRules.validateAll(email, pass, amt, sp, customerMap);

        Customer c = new Customer(fn, ln, email, pass, amt,
                LocalDate.parse(dob), sp);

        customerMap.put(email, c);
        System.out.println("Registration Successful!");
    }

    @Override
    public void signIn(String email, String password)
            throws CustomerException {

        Customer c = customerMap.get(email);

        if (c == null || !c.getPassword().equals(password))
            throw new CustomerException("Invalid email or password!");

        System.out.println("Login successful!");
    }

    @Override
    public void changePassword(String email, String oldPass, String newPass)
            throws CustomerException {

        Customer c = customerMap.get(email);

        if (c == null || !c.getPassword().equals(oldPass))
            throw new CustomerException("Invalid credentials!");

        c.setPassword(newPass);
        System.out.println("Password updated!");
    }

    @Override
    public void unsubscribe(String email)
            throws CustomerException {

        if (customerMap.remove(email) == null)
            throw new CustomerException("Customer not found!");

        System.out.println("Customer removed!");
    }

    @Override
    public void displayAll() {
        customerMap.values().forEach(System.out::println);
    }

    @Override
    public void deleteByPlan(String plan) {
        ServicePlan sp = ServicePlan.valueOf(plan.toUpperCase());

        customerMap.values().removeIf(c -> c.getPlan() == sp);
        System.out.println("Deleted customers under plan: " + plan);
    }

    @Override
    public void sortByDob() {
        customerMap.values().stream()
                .sorted(Comparator.comparing(Customer::getDob))
                .forEach(System.out::println);
    }

    @Override
    public void sortByEmail() {
        customerMap.values().stream()
                .sorted(Comparator.comparing(Customer::getEmail))
                .forEach(System.out::println);
    }

    @Override
    public void sortByPlanAndLastName() {
        customerMap.values().stream()
                .sorted(Comparator.comparing(Customer::getPlan)
                        .thenComparing(Customer::getLastName))
                .forEach(System.out::println);
    }
}
