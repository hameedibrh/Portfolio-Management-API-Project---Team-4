package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("welcome")
    public String welcome(@RequestParam String name) {
        return "Welcome " + name;
    }

    @GetMapping("welcome/{name}")
    public String welcomePath(@PathVariable String name) {
        return "Welcome " + name;
    }

    @GetMapping("customer")
    public Customer getEmployee() {
        Customer customer = new Customer("Some Name");
        /*Address address = new Address();
        address.setNumber("1");
        address.setStreet("STreet");
        employee.setAddress(address);*/
        return customer;
    }

    @GetMapping("customers")
    public List<Customer> getEmployees() {
        return customerRepository.findAll();
    }

    @PostMapping("customer")
    public void addCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }


}
