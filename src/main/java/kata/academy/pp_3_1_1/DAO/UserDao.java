package kata.academy.pp_3_1_1.DAO;

import kata.academy.pp_3_1_1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUser(long id);

    void addUser(User user);

    void updateUser(User user);
}
