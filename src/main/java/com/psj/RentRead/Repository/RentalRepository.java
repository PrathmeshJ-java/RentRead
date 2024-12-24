package com.psj.RentRead.Repository;

import com.psj.RentRead.Entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {

    List<Rental> findByUserIdAndReturnDateIsNull(Long userId);
    long countByUserIdAndReturnDateIsNull(Long userId);
}
