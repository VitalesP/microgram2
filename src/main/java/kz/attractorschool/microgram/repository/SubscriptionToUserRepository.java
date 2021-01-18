package kz.attractorschool.microgram.repository;

import kz.attractorschool.microgram.model.SubscriptionToUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionToUserRepository extends JpaRepository<SubscriptionToUser, Long> {
    //искать подписки по ID пользователя

}
