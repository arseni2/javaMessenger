package com.example.demo.company.entity;

import com.example.demo.company.dto.CreateCompanyDTO;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CompanyRepoImpl implements CompanyRepo {
    private final SessionFactory sessionFactory;

    public void save(CompanyEntity company) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(company);
        tx.commit();
        session.close();
    }
}
