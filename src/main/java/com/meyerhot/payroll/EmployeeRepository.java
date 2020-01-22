package com.meyerhot.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * @author TSM
 */
// tag::code[]
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}