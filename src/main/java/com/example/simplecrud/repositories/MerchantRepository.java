package com.example.simplecrud.repositories;

import com.example.simplecrud.models.Merchant;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends CrudRepository<Merchant, Integer>, JpaSpecificationExecutor<Merchant> {
}
