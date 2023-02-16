package peaksoft.repository;

import peaksoft.model.Company;

import java.util.List;

public interface CompanyRepository {
    List<Company> findAll();

    Company save(Company newCompany);

    Company getCompanyById(Long id);

    void deleteCompany(Long id);

    void updateCompany( Long id,Company updatedCompany);
}
