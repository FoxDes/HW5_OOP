package model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    List<User> getDellUsers();
    String CreateUser(User user);

    void getDellUsers(User user);

    void saveUser(User user);

    void UpdateUser(User user, Fields field, String param);

}
