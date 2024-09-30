package org.example.testing.intergration.common;
import org.example.testing.intergration.big_bang.repository.JdbcRepository;

import java.util.Optional;

public class BaseService<D, ID> {
    protected final JdbcRepository<D, ID> _repository;

    public BaseService(JdbcRepository<D, ID> repository) {
        this._repository = repository;
    }

    public int save(D entity) {

        return _repository.save(entity);
    }
    public int update(D entity) {
        return _repository.save(entity);
    }
    public int delete(ID id) {
       return  _repository.delete(id);
    }
    public Optional<D> findOne(ID id) {
        return _repository.findById(id);
    }
//    public Page<E> GetPaginated(Pageable pageable) {
//       return repository.findAll(pageable);
//    }
}