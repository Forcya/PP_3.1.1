package springboot.web.dao;

import org.springframework.stereotype.Repository;
import springboot.web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository //специальная аннотация, как контроллер - @Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        List<User> allUser = entityManager.createQuery("from User", User.class).getResultList();
        return allUser;
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser (int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(getUser(id));
    }



    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
}

