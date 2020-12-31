package com.apress.spring.repository;

import com.apress.spring.domain.Journal;
import com.apress.spring.domain.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> {

}
