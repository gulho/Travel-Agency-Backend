package ee.gulho.travel.Travel.Agency.Backend.service;

import ee.gulho.travel.Travel.Agency.Backend.model.Authorities;
import ee.gulho.travel.Travel.Agency.Backend.model.Users;
import ee.gulho.travel.Travel.Agency.Backend.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService/* implements UserDetailsService */{
    @Autowired
    private UsersRepository usersRepository;
/*
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        var user = usersRepository.findById(s).orElseThrow(() ->new UsernameNotFoundException("User not found"));
        return new User(user.getName(), user.getPassword(), getAuthorityList(user.getAuthorities()));
    }

    private List<GrantedAuthority> getAuthorityList(List<Authorities> authorities) {
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        authorities.stream().forEach(s -> grantedAuthorities.add(new SimpleGrantedAuthority(s.getAuthority())));
        return grantedAuthorities;
    }*/

    public void registerUser(Users user) {
        usersRepository.save(user);
    }
}
