package com.guild.cars.customer;

import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("ALL")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

