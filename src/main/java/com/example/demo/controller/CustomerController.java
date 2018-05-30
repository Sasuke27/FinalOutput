package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.response.ShopResponse;
import com.example.demo.response.SystemResponse;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by khent on 5/30/2018.
 */


@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ShopService shopService;


    @RequestMapping(value="/registerShop",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)//APPLICATION_JSON_VALUE
    @ResponseBody
    public SystemResponse addUser(
            @RequestBody Customer customer
    ){
        customerService.saveUser(customer);
        return new SystemResponse(true,customer.getUsername()+" is added successfully.");
    }

    @RequestMapping(value = "/loginShop",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public SystemResponse login(
            @RequestBody Customer customer){
        SystemResponse systemResponse = new SystemResponse();
        systemResponse.setFlag(customerService.login(customer));
        if(systemResponse.isFlag()){
            systemResponse.setMsg("Welcome to the Seven Deadly Sins Boar Hat, " + customer.getUsername());
        }else{
            systemResponse.setMsg("Invalid Username or Password");
        }
        return systemResponse;
    }

    @RequestMapping(value = "/Shoplist",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ShopResponse getItems(){
        ShopResponse slr = new ShopResponse();

        //Fetch all the items in the DB
        slr.setItems(shopService.getItems());

        //Assuming its Successful
        SystemResponse systemResponse = new SystemResponse(true,"Fetch Successful.");
        slr.setSystemResponse(systemResponse);

        return slr;
    }
}
