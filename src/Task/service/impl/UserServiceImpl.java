package Task.service.impl;
import Task.util.Constant;
import Task.exception.BadEmailException;
import Task.exception.BadPasswordException;
import Task.exception.UserNotFoundException;
import Task.model.User;
import Task.util.OutputUtil;
import Task.util.ValidationUtil;
import Task.service.UserService;

import java.util.List;
import java.util.Scanner;

import static Task.util.ValidationUtil.emailValidator;
import static Task.util.ValidationUtil.passwordValidator;

public class UserServiceImpl implements UserService {

    /** Function for SignUp users
     */
    @Override
    public void signUp(List<User> userList, Scanner scanner) {
        OutputUtil.enterEmail();
        scanner.nextLine();

        String email = scanner.nextLine();

        OutputUtil.enterThinkYourPassword();
        String password = scanner.nextLine();

        try {
            emailValidator(email);
            passwordValidator(password);

            User user = new User(email, password);
            userList.add(user);

            OutputUtil.printSaveDataUser();
        }
        catch (BadEmailException | BadPasswordException e) {
            if (e instanceof BadEmailException) {
                System.out.println("Ошибка в валидации email");
            }

            if (e instanceof BadPasswordException) {
                System.out.println("Ошибка в валидации password");
            }
        }
    }
    /** Function for SignIn users
     */
    @Override
    public void signIn(List<User> userList, Scanner scanner) {
        try {
            if (!(userList.isEmpty())) {
                OutputUtil.enterEmailForSignInPrint();
                scanner.nextLine();
                String emailTwo = scanner.nextLine();

                OutputUtil.enterPasswordForSignInPrint();
                String password = scanner.nextLine();

                for (User user : userList) {
                    if (user.getEmail().equalsIgnoreCase(emailTwo)
                        && user.getPassword().equalsIgnoreCase(password)) {
                        System.out.println("Вы вошли. Добро пожаловать");
                        return;
                    }
                }
                throw new UserNotFoundException("Пользователь не найден...");
            }
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден...");
        }
    }
}
