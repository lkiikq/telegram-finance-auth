package kz.lkiikq.telegramfinanceauth.service.impl;

import kz.lkiikq.telegramfinanceauth.entity.User;
import kz.lkiikq.telegramfinanceauth.repository.UserRepository;
import kz.lkiikq.telegramfinanceauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public User getUserByChatId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
