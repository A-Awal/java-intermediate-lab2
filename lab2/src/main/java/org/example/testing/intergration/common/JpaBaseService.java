package org.example.testing.intergration.common;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.function.Function;

public class JpaBaseService<D, ID> {
    protected final JpaRepository<D, ID> repository;

    public JpaBaseService(JpaRepository<D, ID> repository) {

        this.repository = repository;
    }

    public D save(D d) {
        return repository.save(d);
    }
    public D findById(ID id) {
        return repository.findById(id).get();
    }
    public <DTO> DTO findById(ID id, Function<D, DTO> function) {
        return function.apply(repository.findById(id).get());
    }
    public void delete(D d) {
        repository.delete(d);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
    public void update(D d) {
        repository.save(d);
    }

}
