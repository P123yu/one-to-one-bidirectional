package com.one_to_one_bidirectional.service;


import com.one_to_one_bidirectional.model.AddressModel;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    // getAll
    List<AddressModel> getAll();
}
