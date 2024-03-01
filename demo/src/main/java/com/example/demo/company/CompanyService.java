package com.example.demo.company;

import com.example.demo.company.dto.CreateCompanyDTO;
import com.example.demo.company.entity.CompanyEntity;
import com.example.demo.company.entity.CompanyRepoImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepoImpl companyRepoImpl;

//    public CompanyService(CompanyRepoImpl companyRepo) {
//        this.companyRepo = companyRepo;
//    }

    public String save(CompanyEntity company) {
        companyRepoImpl.save(company);
        return "SUCCESS";
    }
}
