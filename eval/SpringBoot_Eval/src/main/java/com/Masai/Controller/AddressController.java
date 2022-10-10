package com.Masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Exceptions.AddressNotFound;
import com.Masai.Exceptions.EmployeeNotFound;
import com.Masai.Model.Address;
import com.Masai.Model.Employee;
import com.Masai.Service.AddressServiceIMPL;

@RestController
@RequestMapping("/api/employees")
public class AddressController {
	
	@Autowired
	AddressServiceIMPL aservice;
	
	@GetMapping("{eid}/{pageN}/{pageS}")
	public ResponseEntity<List<Address>> getAllAddress(@PathVariable int pageN, @PathVariable int pageS,@PathVariable int eid) throws AddressNotFound {
		return new ResponseEntity<List<Address>>(aservice.getAllAddress(eid,pageN,pageS),	HttpStatus.OK);
	}
	
	@GetMapping("/{eid}/address/{aid}")
	public ResponseEntity<Address> getAddressById(@PathVariable int eid,@PathVariable int aid) throws AddressNotFound {
		return new ResponseEntity<Address>(aservice.getAddressByID(eid, aid),	HttpStatus.OK);
	}
	
	@PostMapping("/{eid}/address")
	public ResponseEntity<Address> addAddress(@RequestBody Address add,@PathVariable int eid) throws AddressNotFound {
		return new ResponseEntity<Address>(aservice.addAddress(eid, add),	HttpStatus.CREATED);}
	
	@PutMapping("/{eid}/address/{aid}")
	public ResponseEntity<Address> updateAddress(@RequestBody Address add,@PathVariable("id") int aid,@PathVariable int eid) throws AddressNotFound {
		return new ResponseEntity<Address>(aservice.updateAddressID(eid, aid, add),	HttpStatus.OK);}
	
	@DeleteMapping("/{eid}/address/{aid}")
	public ResponseEntity<Boolean> deleteAddress(@PathVariable int eid,@PathVariable int aid) throws  AddressNotFound {
		return new ResponseEntity<Boolean>(aservice.deleteAddress(eid, aid),	HttpStatus.OK);}

}
