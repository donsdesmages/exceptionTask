package Task;

public class Constant {

    public static void enterEmail() {
        System.out.println("Введите ваш email ");
    }

    public static void thinkUpYourPassword() {
        System.out.println("Придумайте ваш password ");
    }

    public static void saveDataUser() {
        System.out.println("Данные сохранены");
    }

    public static void notSaveDataUser() {
        System.out.println("Данные НЕ сохранены");
    }

    static void headCommands () {
        System.out.println("\t\t Добро пожаловать.Выберите действие.");
        System.out.println("\t\t\t 1.SignUp - (регистрация)");
        System.out.println("\t\t\t 2.SignIn -   (войти)");
    }
    public static void enterYourEmail() {
        System.out.println("Введите ваш 'email'" +
            " указанный при регистарции");
    }

    public static void enterYourPassword() {
        System.out.println("Введите ваш 'password' " +
            "указанный при регистарции");
    }
}
