package com.example.techno_shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.techno_shop.model.*;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
