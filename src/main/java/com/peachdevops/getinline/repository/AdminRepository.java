package com.peachdevops.getinline.repository;

import com.peachdevops.getinline.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
