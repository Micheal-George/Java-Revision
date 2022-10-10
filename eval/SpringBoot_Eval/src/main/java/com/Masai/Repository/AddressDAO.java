package com.Masai.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Masai.Model.Address;

public interface AddressDAO extends JpaRepository<Address, Integer>{

	

}
