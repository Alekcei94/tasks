package com.example.servingwebcontent.repo;


import com.example.servingwebcontent.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
