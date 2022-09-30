package br.com.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petshop.model.Contact;

@Repository
public interface DataAccessObject extends JpaRepository<Contact, Long> {

}
