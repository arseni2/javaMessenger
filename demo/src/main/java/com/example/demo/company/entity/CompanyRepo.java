package com.example.demo.company.entity;

import com.example.demo.company.dto.CreateCompanyDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo {
    public void save(CompanyEntity company);
}
