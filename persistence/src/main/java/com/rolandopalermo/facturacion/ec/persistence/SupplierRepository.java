package com.rolandopalermo.facturacion.ec.persistence;

import com.rolandopalermo.facturacion.ec.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Optional<Supplier> findByIdNumber(String idNumber);

}