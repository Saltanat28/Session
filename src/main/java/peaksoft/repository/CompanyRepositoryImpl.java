package peaksoft.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.model.Company;

import java.util.List;
@Repository
@Transactional
public class CompanyRepositoryImpl implements CompanyRepository{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Company> findAll() {
        return entityManager.createQuery("select  c from Company c", Company.class).getResultList();

    }

    @Override
    public Company save(Company newCompany) {
        entityManager.persist(newCompany);
    return newCompany;
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {

    }

    @Override
    public void updateCompany(Long id, Company updatedCompany) {

    }
}
