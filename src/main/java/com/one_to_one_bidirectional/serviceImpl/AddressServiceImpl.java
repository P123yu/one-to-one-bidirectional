package com.one_to_one_bidirectional.serviceImpl;

import com.one_to_one_bidirectional.model.AddressModel;

import com.one_to_one_bidirectional.repository.AddressRepository;
import com.one_to_one_bidirectional.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressModel> getAll() {
        return addressRepository.findAll();
    }
}
