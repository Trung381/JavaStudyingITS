package com.example.vuvantrung.repository.permission;

import com.example.vuvantrung.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer>, PermissionRepositoryCustom {
    Optional<Permission> findByName(String name);
}
