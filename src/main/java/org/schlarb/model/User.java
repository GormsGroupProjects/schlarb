package org.schlarb.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue
    private int id;
//    private String name;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    //users should have a list of artists saved...
    //username, firstname, lastname, password, email



}


