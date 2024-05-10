package com.one_to_one_bidirectional.repository;

import com.one_to_one_bidirectional.model.AddressModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressModel,Long> {
}
