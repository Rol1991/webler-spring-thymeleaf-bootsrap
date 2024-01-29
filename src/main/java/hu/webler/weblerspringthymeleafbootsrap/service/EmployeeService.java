package hu.webler.weblerspringthymeleafbootsrap.service;

import hu.webler.weblerspringthymeleafbootsrap.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<Employee> getAllEmployees();
}
