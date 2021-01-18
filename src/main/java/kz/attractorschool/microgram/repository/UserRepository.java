package kz.attractorschool.microgram.repository;

import kz.attractorschool.microgram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//User по ID;
    //проверить существование пользователя по email
}
