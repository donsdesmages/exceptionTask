package Task.util;
import Task.exception.BadEmailException;
import Task.exception.BadPasswordException;

public class ValidationUtil {
    public static void emailValidator(String email) throws BadEmailException {
        if (!email.isEmpty()) {
            if (email.matches("^[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"
            +"[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$")) {
                return;
            }

            throw new BadEmailException("Был введен не верный ( email ) ");
        }

        throw new BadEmailException("Был введен не верный ( email ) ");
    }

    public static void passwordValidator(String password) throws BadPasswordException {
        if (!(password.isEmpty())) {
            if ((password.matches("^[a-zA-Z0-9]*$")) && (password.length() > 7 )) {
                return;
            }

            throw new BadPasswordException("Был введен не верный ( password ) ");
        }
        throw new BadPasswordException("Был введен не верный ( password ) ");
    }
}
