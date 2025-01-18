package com.project.SpringAngularCrud.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    /*@PostMapping(path = "/save")
    public String saveCustomer(@RequestBody ) {
        return "Customer saved successfully!";
    }*/
}
