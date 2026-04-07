package validation;

import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Pattern;

import exception.CustomerException;
import pojo.*;

public class CustomerValidationRules {

    public static void validateAll(String email, String password, double amount,
                                   ServicePlan plan, Map<String, Customer> map)
            throws CustomerException {

        validateEmail(email, map);
        validatePassword(password);
        validateAmount(amount, plan);
    }

    public static void validateEmail(String email, Map<String, Customer> map)
            throws CustomerException {

        if (map.containsKey(email))
            throw new CustomerException("Duplicate email!");

        if (!email.matches(".*@.*\\.(com|org|net)"))
            throw new CustomerException("Invalid email format!");
    }

    public static void validatePassword(String password)
            throws CustomerException {

        if (!Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=]).+$", password))
            throw new CustomerException("Weak password!");
    }

    public static void validateAmount(double amount, ServicePlan plan)
            throws CustomerException {

        if (amount != plan.getCharges())
            throw new CustomerException("Invalid registration amount!");
    }

    public static ServicePlan parsePlan(String plan)
            throws CustomerException {
        try {
            return ServicePlan.valueOf(plan.toUpperCase());
        } catch (Exception e) {
            throw new CustomerException("Invalid plan!");
        }
    }
}