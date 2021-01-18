package kz.attractorschool.microgram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepositiry extends JpaRepository<PublicationRepositiry, Long> {
    //список всех публикаций по ID подписок;
    //искать публикацию по ID

}
