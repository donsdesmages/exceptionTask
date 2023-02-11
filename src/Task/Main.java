package Task;
import Task.Autentefication.SignUpAndSignIN;
import Task.Exceptions.UserNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

    /**
     * 1.Показать меню
     * 2.Добавить команду signUp ( пользователь вводит данные )
     * 3.Дбавить команду signIn (пользоватлье входит )
     * 4.Проверка введенных данных ( аутентификация )
     * 5.Сохранять данные в коллекцию ArrayList
     *
     */

    static Scanner scanner = new Scanner(System.in);

    public static List<User> stringList = new ArrayList<>();

    public static void main(String[] args) throws UserNotFoundException {

        pleaseEnterYouData();

    }
    static void pleaseEnterYouData () throws UserNotFoundException {

        Constant.headCommands();

        while (true) {

            int enterCommand = scanner.nextInt();

            switch (enterCommand) {
                case 1 :
                    SignUpAndSignIN signUpAndSignIN = new SignUpAndSignIN();
                    signUpAndSignIN.signUp();
                    Constant.headCommands();
                    break;
                case 2 :
                    SignUpAndSignIN signUpAndSignIN1 = new SignUpAndSignIN();
                    signUpAndSignIN1.signIn();
                    System.out.println("Вы вошли. Добро пожаловать");
                    break;
                default:
                    System.out.println("Повторите");
            }
        }
    }
}
