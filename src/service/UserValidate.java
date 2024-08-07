package service;

import Exception.WrongLoginException;
import Exception.WrongPasswordException;


public class UserValidate {

    public static void validateUser(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
            throw new WrongLoginException("Login должен содержать только латинские буквы," +
                    " цифры и знак подчеркивания," +
                    " и не превышать 20 символов.");
        }
        if (!password.matches("[a-zA-Z0-9_]+") || password.length() > 20) {
            throw new WrongPasswordException("Password должен содержать только латинские буквы," +
                    " цифры и знак подчеркивания," +
                    " и не превышать 20 символов.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password и confirmPassword" +
                    " должны быть одинаковые.");
        }
    }
}
