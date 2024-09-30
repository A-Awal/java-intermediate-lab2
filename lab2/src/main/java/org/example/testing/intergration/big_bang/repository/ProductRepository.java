package org.example.testing.intergration.big_bang.repository;

import org.example.testing.intergration.big_bang.model.Product;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
@Profile("big_bang")
public class ProductRepository extends BaseRepository implements JdbcRepository<Product, Integer> {

    public ProductRepository(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public int save(Product product) {
        return 0;
    }

    @Override
    public Optional<Product> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public int update(Product product) {
        return 0;
    }

    @Override
    public int delete(Integer integer) {
        return 0;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public List<Product> findAllByName(Iterable<String> names, RowMapper<Product> rowMapper) {
        return List.of();
    }
}
