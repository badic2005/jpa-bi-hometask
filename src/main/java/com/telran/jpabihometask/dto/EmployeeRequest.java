package com.telran.jpabihometask.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeRequest {

    private Long companyId;

    private String firstName;

    private String lastName;
}
