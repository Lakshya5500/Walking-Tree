package com.Walkingtree.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.Walkingtree.Entity.Employee;
@Service
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
