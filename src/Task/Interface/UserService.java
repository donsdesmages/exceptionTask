package Task.Interface;

import Task.Exceptions.UserNotFoundException;

public interface UserService {

    void signUp();

    void signIn() throws UserNotFoundException;

}
