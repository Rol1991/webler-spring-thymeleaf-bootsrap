package hu.webler.weblerspringthymeleafbootsrap.controller;

import hu.webler.weblerspringthymeleafbootsrap.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl employeeServiceImpl;

    @GetMapping("/employees")
    @ResponseBody
    public String renderEmployess(Model model) {
        model.addAttribute("Employees", employeeServiceImpl.getAllEmployees());
        return "index";
    }
}
