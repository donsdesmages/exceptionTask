package Task.service;

import Task.model.User;

import java.util.List;
import java.util.Scanner;

public interface UserService {
    void signUp(List<User> userList, Scanner scanner);
    void signIn(List<User> userList, Scanner scanner);
}
