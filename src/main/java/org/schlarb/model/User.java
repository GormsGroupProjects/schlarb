package org.schlarb.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private String name;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    @ManyToMany
//            (mappedBy = "name")
    private List<Artist> artistList; //is there a better way?
    //do I need eager loading?

}


