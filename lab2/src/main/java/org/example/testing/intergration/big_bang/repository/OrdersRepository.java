package org.example.testing.intergration.big_bang.repository;

import org.example.testing.intergration.big_bang.model.Purchases;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Repository
@Profile("big_bang")
public class OrdersRepository extends BaseRepository implements JdbcRepository<Purchases, Integer> {
    public OrdersRepository(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public int save(Purchases purchases) {
        String sql = "Inser Into Purchases (quantity) values (?)";
        var res = _jdbcTemplate.update(sql, purchases.getQuantity());
        return res;
    }

    @Override
    public Optional<Purchases> findById(Integer integer) {
        var res = _jdbcTemplate.queryForMap("select * from Purchases where id = ?", integer);

        Purchases purchase = new Purchases();
        purchase.setId(integer);
        purchase.setPurchaseDate((Date)res.get("date"));
        purchase.setQuantity((Integer)res.get("quantity"));

        return Optional.of(purchase);
    }

    @Override
    public int update(Purchases purchases) {
        return _jdbcTemplate.update("update Purchases set quantity = ? where id = ?", purchases.getQuantity(), purchases.getId());
    }

    @Override
    public int delete(Integer integer) {
        return _jdbcTemplate.update("delete from Purchases where id = ?", integer);
    }

    @Override
    public List<Purchases> findAll() {
        var res = _jdbcTemplate.query("select * from Purchases", (rs, ind) -> new Purchases() );
        return res;
    }

    @Override
    public List<Purchases> findAllByName(Iterable<String> names, RowMapper<Purchases> rowMapper) {
        var res = _jdbcTemplate.query("select * from Purchases", (rs, ind) -> new Purchases() );
        return res;
    }
}
