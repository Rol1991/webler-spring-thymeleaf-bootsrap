package hu.webler.weblerspringthymeleafbootsrap.service;

import hu.webler.weblerspringthymeleafbootsrap.model.Employee;
import hu.webler.weblerspringthymeleafbootsrap.view.model.Paged;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

   //List<Employee> getAllEmployees();

    Paged<Employee> getAllEmployeesPaginated(int pageNumber);
}
