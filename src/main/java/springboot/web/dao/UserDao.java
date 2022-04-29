package springboot.web.dao;

import springboot.web.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
    void updateUser(User user);
}
