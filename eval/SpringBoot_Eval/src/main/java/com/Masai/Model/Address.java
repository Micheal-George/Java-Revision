package com.Masai.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int address_id;
	
	@Size(min = 2)
	@NotNull(message = "Street is mandatory")
	private String street;
	
	@Size(min = 2)
	@NotNull(message = "City is mandatory")
	private String city;
	
	@Size(min = 2)
	@NotNull(message = "State is mandatory")
	private String state;
	
	@Size(min = 2)
	@NotNull(message = "Country is mandatory")
	private String country;
	
	@ManyToOne
	@JsonIgnore
	Employee employee;

}
