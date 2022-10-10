package com.Masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Masai.Exceptions.EmployeeNotFound;
import com.Masai.Model.Employee;
import com.Masai.Repository.EmployeeDAO;


@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	EmployeeDAO edao;
	
	@Override
	public List<Employee> getAllEmployee(int pageN, int pageS, String sortBy, String sortDir) throws EmployeeNotFound {
		List<Employee> list=edao.findAll();
		if(list.size()>0)
		{  Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
			Pageable paging = PageRequest.of(pageN, pageS);
	        Page<Employee> pagedResult = edao.findAll(paging);
	        return pagedResult.toList();
		}
		
		throw new EmployeeNotFound("No Employee data");
	}

	@Override
	public Employee getEmployeeByID(int id) throws EmployeeNotFound {
		Optional<Employee> opt=edao.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		throw new EmployeeNotFound("Employee not found with the id : "+id);
	}

	@Override
	public Employee updateEmployeeyID(int id, Employee employee) throws EmployeeNotFound {
		Optional<Employee> opt=edao.findById(id);
		if(opt.isPresent())
		{ Employee exist=opt.get();
			if(employee.getFirst_name()!=null)
				exist.setFirst_name(employee.getFirst_name());
			if(employee.getLast_name()!=null)
				exist.setLast_name(employee.getLast_name());
			if(employee.getCell_no()!=null)
				exist.setCell_no(employee.getCell_no());
			edao.save(exist);
			return exist;
		}
		throw new EmployeeNotFound("Employee not found with the id : "+id);
	}

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeNotFound {
		
			return edao.save(employee);
		
	}

	@Override
	public boolean deleteEmployee(int id) throws EmployeeNotFound {
		Optional<Employee> opt=edao.findById(id);
		if(opt.isPresent())
		{
			edao.delete(opt.get());
			return true;
		}
		throw new EmployeeNotFound("Employee not found with the id : "+id);
	}

}
