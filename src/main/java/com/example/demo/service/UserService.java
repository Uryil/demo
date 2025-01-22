import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(String username, String password, User.Role role) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password); // Пароль зашифрован через setPassword
        user.setRole(role);
        return userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
