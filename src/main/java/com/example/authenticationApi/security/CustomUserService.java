package com.example.authenticationApi.security;

import com.example.authenticationApi.models.Customer;
import com.example.authenticationApi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CustomUserService implements UserDetailsService {
  @Autowired
    CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Customer> customer=customerRepository.findByEmail(email);
        if (!customer.isPresent()){
            throw new UsernameNotFoundException("user with email address not found");
        }else {

            return new User(customer.get().getEmail(),customer.get().getPassword(),new ArrayList<>());
        }

    }
}
