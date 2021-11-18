package com.bootcampcrudusuario.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcampcrudusuario.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}