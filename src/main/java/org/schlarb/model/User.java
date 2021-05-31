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
    @Column(name="username", nullable = false)
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Artist> artistList; //is there a better way?

    public void setPassword(String pw){ //
                this.password = pw;
    }
    public String getPassword(){
        return this.password;
    }
    public String getUsername(){
        return this.username;
    }
    public User(String username, String password) {
        this.password = password;
        this.username = username;
    } //needed to deserialize the userObject for login

    public void addArtist(Artist artist){
        this.artistList.add(artist);
    }
    public boolean containsArtist(Artist artist){
        if(this.artistList.contains(artist)){
            return true;
        }
        else{
            return false;
        }
    }


}


