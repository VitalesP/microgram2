package kz.attractorschool.microgram.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "subscription_to_user")
public class SubscriptionToUser extends ClassForId {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followers_user_id")
    private User followers;


    @Column(name = "local_Date")
    private LocalDate localDate;

}
