package hlf.portal.app.com.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import hlf.portal.app.com.model.User;
import hlf.portal.app.com.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
