package com.example.demo.repository.impl;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class CustomerRepsitoryImpl implements CustomerRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public <S extends Customer> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Customer> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Iterable<Customer> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Customer> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Customer> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Customer> findAll(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public <S extends Customer> List<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Customer> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Customer> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Customer getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Customer> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Customer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Customer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Customer> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Customer> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Customer> boolean exists(Example<S> example) {
        return false;
    }

//    @Override
//    public Customer findById(Long id) {
//        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
//        query.setParameter("id", id);
//        try {
//            return query.getSingleResult();
//        }catch (NoResultException e){
//            return null;
//        }
//    }

    @Override
    public Object save(Customer model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
        return null;
    }

//    @Override
//    public void remove(Long id) {
//        Customer customer = findById(id);
//        if(customer != null){
//            em.remove(customer);
//        }
    }
