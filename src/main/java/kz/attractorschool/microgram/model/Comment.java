package kz.attractorschool.microgram.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "comment")
public class Comment extends ClassForId{
    @Column(name = "text_for_comment")
    private String textForComment;

    @Column(name = "local_Date")
    private LocalDate localDate;

}
