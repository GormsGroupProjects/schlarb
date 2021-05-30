package org.schlarb.repository;

import org.schlarb.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository {

    public List<Artist> findByName(String name);
    //public List<SchlarbUser> findByUsername(String name);

}
