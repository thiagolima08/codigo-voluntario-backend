package com.projeto.codigovoluntario.service;

import com.projeto.codigovoluntario.model.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // add o model de usuario
        ApplicationUser user = userService.getByEmail(email);

        if (user.getEmail().equals(email)){
            return (UserDetails) new ApplicationUser(email, user.getPassword());
        } else{
            throw new UsernameNotFoundException("User not found with email: "+ email);
        }
    }

}
