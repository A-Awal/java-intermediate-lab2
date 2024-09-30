package org.example.testing.intergration.big_bang.repository;

import org.example.testing.intergration.big_bang.model.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Repository
@Profile("big_bang")
public class CustomerRepository extends BaseRepository implements JdbcRepository<Customer, Integer> {
    public CustomerRepository( JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public int save(Customer customer) {
        String sql = "insert into customers (name) values (?)";
        var res = _jdbcTemplate.update(sql, customer.getName());
        return res;
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        var rs = _jdbcTemplate.queryForMap("select * from customers where id = ?", id);

        Customer customer = Customer.builder().
                        id((Integer) rs.get("id")).
                        name((String) rs.get("name")).
                        email((String) rs.get("email")).build();

        return Optional.of(customer);
    }

    @Override
    public int update(Customer customer) {
        return _jdbcTemplate.update("update customers set first_name = ? where id = ?", customer.getName(), customer.getId());
    }

    @Override
    public int delete(Integer integer) {
        return _jdbcTemplate.update("delete from customers where id = ?", integer);
    }

    @Override
    public List<Customer> findAll() {
        var res = _jdbcTemplate.query("select * from customers", (rs, rowNum) -> Customer.builder().build());
        return res;
    }

    @Override
    public List<Customer> findAllByName(Iterable<String> names, RowMapper<Customer> rowMapper) {
        return _jdbcTemplate.query("select * from customers", rowMapper, names);
    }


}
