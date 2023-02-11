package Task.Validation;
import Task.Exceptions.BadEmailException;
import Task.Exceptions.BadPasswordException;

public class Validation {

    public static boolean dataUserValidFunction1(String email) throws BadEmailException {

        if (!(email.isEmpty())) {
            if (email.contains("@")) {
                return true;
            }
            throw new BadEmailException("Был введен не верный ( email ) ");
        }
        return false;
    }

    public static boolean dataUserValidFunction2(String password) throws BadPasswordException {

        if (!(password.isEmpty())) {
            if ((password.matches("^[a-zA-Z0-9]*$")) && (password.length() > 7 )) {

                return true;
            }

        }
        throw new BadPasswordException("Был введен не верный ( password ) ");
    }
}
