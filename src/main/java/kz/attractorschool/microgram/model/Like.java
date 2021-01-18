package kz.attractorschool.microgram.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "like")
public class Like extends ClassForId {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publication_id")
    private Publication publication;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followers_user_id")
    private User user;

    @Column(name = "local_Date")
    private LocalDate localDate;

}
