package kz.attractorschool.microgram.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "like")
public class Like extends ClassForId{
    @Column(name = "who_like")
    private String whoLike;

    @Column(name = "what_like")
    private String whatLike;

    @Column(name = "local_Date")
    private LocalDate localDate;

}
