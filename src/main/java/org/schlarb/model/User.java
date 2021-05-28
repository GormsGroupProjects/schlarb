package org.schlarb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
//@AllArgsConstructor
@Data
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private String email;

}
