package com.example.projectTrial.service;

import com.example.projectTrial.dto.EmployeeDto;
import com.example.projectTrial.entity.Employee;
import com.example.projectTrial.mapper.EmployeeMapper;
import com.example.projectTrial.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeImp implements EmployeeService {
    private EmployeeRepository employeeRepository;


    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
