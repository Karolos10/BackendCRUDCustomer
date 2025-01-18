package com.project.SpringAngularCrud.Controller;

import com.project.SpringAngularCrud.DTO.CustomerDTO;
import com.project.SpringAngularCrud.DTO.CustomerSaveDTO;
import com.project.SpringAngularCrud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {

        String id = customerService.addCustomer(customerSaveDTO);
        return id;
    }
}
