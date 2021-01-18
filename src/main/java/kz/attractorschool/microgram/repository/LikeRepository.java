package kz.attractorschool.microgram.repository;

import kz.attractorschool.microgram.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    //искать лайк по ID публикации
    //искать лайк по ID пользователя
    //
}
