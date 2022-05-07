package com.spring.escolacrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.escolacrud.models.Professor;

public interface RepositoryProfessor extends CrudRepository<Professor, String> {

}
