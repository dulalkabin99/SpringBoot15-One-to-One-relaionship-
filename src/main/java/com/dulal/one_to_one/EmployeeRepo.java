package com.dulal.one_to_one;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo  extends CrudRepository<Employee, Long> {
}


