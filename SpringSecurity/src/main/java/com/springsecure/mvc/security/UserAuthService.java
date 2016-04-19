package com.springsecure.mvc.security;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecure.mvc.model.Authenticate;
import com.springsecure.mvc.repository.AuthenticateRepository;

@Service("userAuthService")
public class UserAuthService implements UserDetailsService {

	@Autowired
	private AuthenticateRepository authenticateRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Authenticate authenticate = authenticateRepository.findByUsername(username);
		List<GrantedAuthority> authorities = buildUserAuthority(authenticate);
		User user = buildUserForAuthentication(authenticate, authorities);
		return user;
	}

	private User buildUserForAuthentication(Authenticate authenticate, List<GrantedAuthority> authorities) {
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		User user = new User(authenticate.getUsername(), authenticate.getPassword(), enabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, authorities);
		
		return user;
	}

	private List<GrantedAuthority> buildUserAuthority(Authenticate authenticate) {
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		setAuths.add(new SimpleGrantedAuthority(authenticate.getUser().getRole().getName()));

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(setAuths);

		return authorities;
	}

}
