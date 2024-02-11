package br.com.matus.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.matus.api.model.Client;

@Repository
public interface Repositori extends CrudRepository<Client, Long>{

}