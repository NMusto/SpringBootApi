package com.application.rest.SpringBootRest.repositories;

import com.application.rest.SpringBootRest.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
