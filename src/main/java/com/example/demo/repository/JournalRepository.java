package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
