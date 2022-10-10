package com.Masai.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	@NotNull(message = "Mobile is mandatory")
	private String first_name;
	@NotNull(message = "Mobile is mandatory")
	private String Last_name;
	
	@Size(max = 10,min = 10)
	@Column(unique = true)
	@NotNull(message = "Mobile is mandatory")
	private String cell_no;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee",fetch = FetchType.LAZY)
	List<Address> address=new ArrayList<>();
	
}
