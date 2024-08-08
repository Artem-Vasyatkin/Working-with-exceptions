package utils;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;


public class ValidateUtils {
    private static final Pattern PATTERN =
            Pattern.compile("\\w{1,20}");

    public static void validateUser(String login, String password, String confirmPassword) {
        if (!PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Login должен содержать только латинские буквы," +
                    " цифры и знак подчеркивания," +
                    " и не превышать 20 символов.");
        }
        if (!PATTERN.matcher(password).matches()) {
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
