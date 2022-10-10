package com.Masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Masai.Exceptions.AddressNotFound;
import com.Masai.Exceptions.EmployeeNotFound;
import com.Masai.Model.Address;
import com.Masai.Model.Employee;
import com.Masai.Repository.AddressDAO;
import com.Masai.Repository.EmployeeDAO;

@Service
public class AddressServiceIMPL implements AddressService{

	@Autowired
	AddressDAO adao;
	
	@Autowired
	EmployeeDAO edao;
	
	@Override
	public List<Address> getAllAddress(int eid,int pageN, int pageS) throws AddressNotFound {
		Optional<Employee> emp=edao.findById(eid);
		List<Address> list=emp.get().getAddress();
		if(list.size()>0)
		{
			Pageable paging = PageRequest.of(pageN, pageS);
	        Page<Address> pagedResult = adao.findAll(paging);
	        return pagedResult.toList();
		}
		
		throw new AddressNotFound("No Address data");
	}

	

	@Override
	public Address getAddressByID(int eid,int aid) throws AddressNotFound {
		Optional<Employee> emp=edao.findById(eid);
		if(emp.isPresent())
		{
		Optional<Address> opt=adao.findById(aid);
		if(opt.isPresent())
		{
			return opt.get();
		}
		throw new AddressNotFound("Address not found with the id : "+aid);
		}
		throw new AddressNotFound("Address not found with the id : "+eid);
	}

	@Override
	public Address updateAddressID(int eid,int aid, Address address) throws AddressNotFound {
		Optional<Employee> emp=edao.findById(eid);
		if(emp.isPresent())
		{
		Optional<Address> opt=adao.findById(aid);
		if(opt.isPresent())
		{  Address exist= opt.get();
		 if(address.getStreet()!=null)
			 exist.setStreet(address.getStreet());
		 if(address.getCity()!=null)
			 exist.setCity(address.getCity());
		 if(address.getState()!=null)
			 exist.setState(address.getState());
		 if(address.getCountry()!=null)
			 exist.setCountry(address.getCountry());
		 return adao.save(exist);
		}
		throw new AddressNotFound("Address not found with the id : "+aid);
		}
		throw new AddressNotFound("Address not found with the id : "+eid);
	}

	@Override
	public Address addAddress(int eid,Address address) throws AddressNotFound {
		Optional<Employee> emp=edao.findById(eid);
		if(emp.isPresent())
		{
		  address.setEmployee(emp.get());
		 return adao.save(address);
		  
		}
		throw new AddressNotFound("Address not found with the id : "+eid);
	}

	@Override
	public boolean deleteAddress(int eid,int aid) throws AddressNotFound {
		Optional<Employee> emp=edao.findById(eid);
		if(emp.isPresent())
		{
		Optional<Address> opt=adao.findById(aid);
		if(opt.isPresent())
		{ adao.delete(opt.get());
			return true;
		}
		}
		throw new AddressNotFound("Address not found with the id : "+aid);
	}

}
