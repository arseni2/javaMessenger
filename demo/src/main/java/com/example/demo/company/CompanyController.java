package com.example.demo.company;

import com.example.demo.company.dto.CreateCompanyDTO;
import com.example.demo.company.entity.CompanyEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CompanyController {
    public final CompanyService companyService;

//    @PostMapping("create")
//    public String save(@RequestBody CompanyEntity dto) {
//        return companyService.save(dto);
//    }
}
