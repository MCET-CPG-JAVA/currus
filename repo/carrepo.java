package com.k2n.currus.repo;

import com.k2n.currus.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carrepo extends JpaRepository<Car, Long> {
}
