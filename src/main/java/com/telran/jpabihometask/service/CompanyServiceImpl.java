package com.telran.jpabihometask.service;

import com.telran.jpabihometask.dto.CompanyResponse;
import com.telran.jpabihometask.model.Company;
import com.telran.jpabihometask.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public CompanyResponse save(Company company) {
        Company companyNew = companyRepository.save(company);

        CompanyResponse companyResponse = CompanyResponse.builder()
                .companyName(companyNew.getCompanyName())
                .build();

        return companyResponse;

    }

    @Override
    public CompanyResponse getCompany(Long id) {

        Company company = companyRepository.getOne(id);

        CompanyResponse companyResponse = CompanyResponse.builder()
                .companyName(company.getCompanyName())
                .employeesNames(company.getEmployees().stream()
                        .map(e->e.getFirstName()+" "+e.getLastName())
                        .collect(Collectors.toList()))
                .build();

        return companyResponse;
    }
}
