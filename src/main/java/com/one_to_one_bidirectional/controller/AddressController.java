package com.one_to_one_bidirectional.controller;


import com.one_to_one_bidirectional.model.AddressModel;
import com.one_to_one_bidirectional.serviceImpl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressServiceImpl;

    @GetMapping("/getAll")
    public List<AddressModel> getAll(){
        return addressServiceImpl.getAll();
    }
}
