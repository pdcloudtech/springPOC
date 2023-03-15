package org.example.repository;

import org.example.customerEntities.CustomerProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // indicates below interface has storage,retrieval, search , update and delete operations on objects
public interface CustomerRepository extends CrudRepository<CustomerProfile, String> {
}
