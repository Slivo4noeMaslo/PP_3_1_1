package kata.academy.pp_3_1_1.service;

import kata.academy.pp_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUser(long id);

    void addUser(User user);

    void updateUser(User user);
}
