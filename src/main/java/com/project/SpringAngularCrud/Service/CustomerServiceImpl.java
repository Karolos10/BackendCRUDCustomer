package com.project.SpringAngularCrud.Service;

import com.project.SpringAngularCrud.DTO.CustomerSaveDTO;
import com.project.SpringAngularCrud.Model.Customer;
import com.project.SpringAngularCrud.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {

        Customer customer = new Customer(
                customerSaveDTO.getCustomerName(),
                customerSaveDTO.getCustomerEmail(),
                customerSaveDTO.getMobile()
        );

        customerRepository.save(customer);
        return customer.getCustomerName();
    }
}
