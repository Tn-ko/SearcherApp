package com.api.peolpesearcher.repo;

import com.api.peolpesearcher.models.ERole;
import com.api.peolpesearcher.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
