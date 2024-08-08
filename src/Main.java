import exception.WrongPasswordException;
import exception.WrongLoginException;

import static utils.ValidateUtils.validateUser;

public class Main {
    public static void main(String[] args) {

        try {
            validateUser("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Логин и пароль успешно проверены.");
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

