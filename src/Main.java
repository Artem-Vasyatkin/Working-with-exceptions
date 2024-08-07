import Exception.WrongPasswordException;
import Exception.WrongLoginException;

import static service.UserValidate.validateUser;

public class Main {
    public static void main(String[] args) {

        try {
            validateUser("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Логин и пароль успешно проверены.");
        } catch (WrongLoginException l) {
            System.out.println(l.getMessage());
        } catch (WrongPasswordException p) {
            System.out.println(p.getMessage());
        }
    }
}