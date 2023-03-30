package in.sachinkr.sanschool.security;

import in.sachinkr.sanschool.model.Person;
import in.sachinkr.sanschool.model.Roles;
import in.sachinkr.sanschool.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class SanSchoolUsernameAndPassAuth implements AuthenticationProvider {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String pwd = authentication.getCredentials().toString();
//        pwd = passwordEncoder.encode(pwd);
        Person person = personRepository.findByEmail(email);
        if(person != null && person.getPersonId()>0 && passwordEncoder.matches(pwd,person.getPwd())){
            return new UsernamePasswordAuthenticationToken(
                    email,pwd,getGrandtedAuthorities(person.getRoles())
            );
        } else {
            throw new BadCredentialsException("Invalid Credentials");
        }
    }

    private List<GrantedAuthority> getGrandtedAuthorities(Roles roles) {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_"+roles.getRoleName()));
        return grantedAuthorityList;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
