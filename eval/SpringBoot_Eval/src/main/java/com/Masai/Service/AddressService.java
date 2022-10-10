package com.Masai.Service;

import java.util.List;

import com.Masai.Exceptions.AddressNotFound;
import com.Masai.Model.Address;


public interface AddressService {

public List<Address> getAllAddress(int eid,int pageN,int pageS) throws AddressNotFound;
	
	public Address getAddressByID(int eid,int aid) throws AddressNotFound;
	
	public Address updateAddressID(int eid,int aid,Address address) throws AddressNotFound;
	
	public Address addAddress(int eid,Address address) throws AddressNotFound;
	
	public boolean deleteAddress(int eid,int aid) throws AddressNotFound;
}
