package com.project.SpringAngularCrud.Service;

import com.project.SpringAngularCrud.DTO.CustomerDTO;
import com.project.SpringAngularCrud.DTO.CustomerSaveDTO;

public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);
}
