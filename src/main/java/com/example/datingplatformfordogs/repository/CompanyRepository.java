package com.example.datingplatformfordogs.repository;

import com.example.datingplatformfordogs.domain.Comment;
import com.example.datingplatformfordogs.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
