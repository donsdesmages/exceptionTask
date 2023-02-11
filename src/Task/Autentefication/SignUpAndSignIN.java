package Task.Autentefication;
import Task.Constant;
import Task.Exceptions.BadEmailException;
import Task.Exceptions.BadPasswordException;
import Task.Exceptions.UserNotFoundException;
import Task.Interface.UserService;
import Task.Main;
import Task.User;
import Task.Validation.Validation;

import java.util.Scanner;

public class SignUpAndSignIN implements UserService {

    /** Function for SignUp users
     */
    @Override
    public void signUp() {
        Scanner scanner = new Scanner(System.in);
        Constant.enterEmail();
        String email = scanner.nextLine();

        Constant.thinkUpYourPassword();
        String password = scanner.nextLine();
        try {
            if ((Validation.dataUserValidFunction1(email)) && (Validation.dataUserValidFunction2(password))) {

                User user = new User(email, password);
                Main.stringList.add(user);

                Constant.saveDataUser();
            }
            else {
                Constant.notSaveDataUser();
            }
        }
        catch (BadEmailException | BadPasswordException e) {
            throw new RuntimeException(e);
        }
    }
    /** Function for SignIn users
     */
    @Override
    public void signIn() throws UserNotFoundException { // вход

        if (!(Main.stringList.isEmpty())) {
            Scanner scanner = new Scanner(System.in);
            Constant.enterYourEmail();
            String emailTwo = scanner.nextLine();

            Constant.enterYourPassword();
            String password = scanner.nextLine();

            for (User user : Main.stringList) {
                if (user.getEmail().equalsIgnoreCase(emailTwo) && user.getPassword().equalsIgnoreCase(password)) {

                    return;
                }
            }
            throw new UserNotFoundException("Пользователь не найден...");
        }
    }
}
