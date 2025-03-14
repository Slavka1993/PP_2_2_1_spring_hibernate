package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void update(User user);

    User getUserByCar(String model, int series);

    User getUserById(Long id);
}
