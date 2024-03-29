package hu.webler.weblerspringthymeleafbootsrap.service;

import hu.webler.weblerspringthymeleafbootsrap.bootsrap.DataLoader;
import hu.webler.weblerspringthymeleafbootsrap.model.Employee;
import hu.webler.weblerspringthymeleafbootsrap.view.model.Paged;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final DataLoader dataLoader;

    /*@Override
    public List<Employee> getAllEmployees() {
        return dataLoader.getEmployees();
    }*/


    @Override
    public Paged<Employee> getAllEmployeesPaginated(int pageNumber) {
        return dataLoader.getEmployees(pageNumber);
    }
}
