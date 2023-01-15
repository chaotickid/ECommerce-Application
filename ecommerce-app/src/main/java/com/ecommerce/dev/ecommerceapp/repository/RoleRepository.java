package com.ecommerce.dev.ecommerceapp.repository;



import java.util.Optional;

import com.ecommerce.dev.ecommerceapp.models.ERole;
import com.ecommerce.dev.ecommerceapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
