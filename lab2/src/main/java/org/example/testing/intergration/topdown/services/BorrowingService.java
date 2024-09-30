package org.example.testing.intergration.topdown.services;

import org.example.testing.intergration.common.JpaBaseService;
import org.example.testing.intergration.topdown.model.Borrowing;
import org.example.testing.intergration.topdown.repository.BorrowingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@Profile("topdown")
public class BorrowingService extends JpaBaseService<Borrowing, Integer> {
    public BorrowingService(BorrowingRepository repository) {
        super(repository);
    }

}
