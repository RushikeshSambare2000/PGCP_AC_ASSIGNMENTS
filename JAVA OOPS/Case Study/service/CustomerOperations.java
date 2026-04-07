package service;

import exception.CustomerException;

public interface CustomerOperations {
    void signUp(String firstName, String lastName, String email,
                String password, double amount, String dob, String plan)
            throws CustomerException;

    void signIn(String email, String password) throws CustomerException;

    void changePassword(String email, String oldPass, String newPass)
            throws CustomerException;

    void unsubscribe(String email) throws CustomerException;

    void displayAll();

    void deleteByPlan(String plan);

    void sortByDob();

    void sortByEmail();

    void sortByPlanAndLastName();
}