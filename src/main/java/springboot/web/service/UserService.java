package springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.web.dao.UserDao;
import springboot.web.entity.User;

import java.util.List;



@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public User getUser(int id) {
        return userDao.getById(id);
    }

    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

    public void updateUser(User user) {
        userDao.save(user);
    }
}
