package com.telran.jpabihometask.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CompanyResponse {

    private String companyName;

    private List<String> employeesNames;
}
