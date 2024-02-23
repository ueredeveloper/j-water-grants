package com.api.main.repositories;

import com.api.main.models.EnderecoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {


}