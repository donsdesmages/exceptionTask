package Task;
import Task.model.User;
import Task.service.UserService;
import Task.service.impl.UserServiceImpl;
import Task.util.OutputUtil;

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
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        pleaseEnterYouData(userList);
    }
    static void pleaseEnterYouData (List<User> userList) {
        UserService userService = new UserServiceImpl();
        OutputUtil.printHeadCommandsMenu();

        while (true) {
            int enterCommand = scanner.nextInt();

            switch (enterCommand) {
                case 1 -> {
                    userService.signUp(userList, scanner);
                    OutputUtil.printHeadCommandsMenu();
                }
                case 2 -> {
                    userService.signIn(userList, scanner);
                    OutputUtil.printHeadCommandsMenu();
                }
                default -> System.out.println("Повторите");
            }
        }
    }
}
