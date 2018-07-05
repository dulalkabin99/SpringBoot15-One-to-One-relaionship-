package com.dulal.one_to_one;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    EmployeeRepo employeeRepo;

    @RequestMapping
    public String index (Model model) {
        //create an Employee
        Employee employee=new Employee();
        employee.setName("Bullhock");
        employee.setSsn("111-111-2222");

        //Create Laptop

        Laptop laptop=new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("lattitude");

        //Adding Employee to the laptop
        employee.setLaptop(laptop);

        //reposit this


        employeeRepo.save(employee);

        //send all the employees to the templates

        model.addAttribute("employees", employeeRepo.findAll());
        return "index";

    }

}
