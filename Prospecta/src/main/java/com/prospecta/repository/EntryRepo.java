package com.prospecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospecta.entity.Entry;

public interface EntryRepo extends JpaRepository<Entry, Integer>{

}
