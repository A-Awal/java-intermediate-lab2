package org.example.testing.intergration.big_bang.repository;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Optional;

public interface JdbcRepository<D, ID> {
    int save(D d);
    Optional<D> findById(ID id);
    int update(D d);
    int delete(ID id);
    List<D> findAll();
    List<D> findAllByName(Iterable<String> names, RowMapper<D> rowMapper);

}
