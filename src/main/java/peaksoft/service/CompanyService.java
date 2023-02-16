package peaksoft.service;

import peaksoft.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    Company save(Company newCompany);
}
