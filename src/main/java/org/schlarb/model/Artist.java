package org.schlarb.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String url;
    private String image_url;
    private String facebook_page_url;
    private String mbid;
    private int tracker_count;
    private int upcoming_event_count;



}
