package org.example.testing.intergration.big_bang.repository;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseRepository{
    protected final JdbcTemplate _jdbcTemplate;

    public BaseRepository(JdbcTemplate jdbcTemplate){

        this._jdbcTemplate = jdbcTemplate;
    }

}
