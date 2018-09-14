package com.telran.jpabihometask.service;

import com.telran.jpabihometask.dto.CompanyResponse;
import com.telran.jpabihometask.model.Company;

public interface CompanyService {
    CompanyResponse save(Company company);

    CompanyResponse getCompany(Long id);
}
