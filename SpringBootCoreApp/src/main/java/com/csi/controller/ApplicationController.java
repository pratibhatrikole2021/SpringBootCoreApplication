package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/services")
    public String sayHello(){

        return "Welcomw to Fintech CSI";

    }
    @GetMapping("/address")
    public String sayAddress(){

        return "Pune";

    }
    @GetMapping("/department")
    public String department(){

        return "HR";

    }

    @GetMapping("/showdata")

    public List<Employee> showData(){

        List<Employee> empList = new LinkedList<>();
        empList.add(new Employee(1,"pratibha"));
        empList.add(new Employee(2,"pooja"));

        return empList;


    }



}

class Employee{

    private int empId;

    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }




}
