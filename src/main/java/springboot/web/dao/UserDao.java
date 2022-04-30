package springboot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.web.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
