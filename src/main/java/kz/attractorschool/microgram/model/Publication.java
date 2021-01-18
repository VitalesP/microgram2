package kz.attractorschool.microgram.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "publication")
public class Publication extends ClassForId{
    @Column(name = "images")
    private String images;

    @Column(name = "description")
    private String description;

    @Column(name = "local_Date")
    private LocalDate localDate;


}
