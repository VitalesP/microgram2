package kz.attractorschool.microgram.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User extends ClassForId {
@Column(name = "name")
private String name;

@Column(name = "email")
private String email;

@Column(name = "pass")
private String pass;

@Column(name = "count_public")
private String countPublic;

@Column(name = "count_subscribe")
private String countSubscribe;

@Column(name = "count_subscriber")
private String countSubscriber;

}
