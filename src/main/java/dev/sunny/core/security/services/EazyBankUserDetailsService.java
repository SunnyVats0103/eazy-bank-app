package dev.sunny.core.security.services;

import dev.sunny.core.model.Customer;
import dev.sunny.core.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EazyBankUserDetailsService implements UserDetailsService {

    private final CustomerRepository customerRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Customer> foundCustomer = customerRepo.findCustomerByEmail(username);

        Customer customer = foundCustomer.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority(customer.getRole()));

        return new User(customer.getEmail(), customer.getPwd(), authorities);
    }
}
