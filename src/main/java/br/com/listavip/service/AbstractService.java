package br.com.listavip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public abstract class AbstractService<E, I extends Serializable, R extends CrudRepository<E, I>> {

    @Autowired
    private R repository;

    public Iterable<E> findAll() {
        return this.repository.findAll();
    }

    public E findOne(Long id) {
        return this.repository.findOne((I) id);
    }

}
