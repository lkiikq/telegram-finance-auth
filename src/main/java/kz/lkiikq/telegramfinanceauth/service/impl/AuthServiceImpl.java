package kz.lkiikq.telegramfinanceauth.service.impl;

import kz.lkiikq.telegramfinanceauth.entity.User;
import kz.lkiikq.telegramfinanceauth.model.dto.UserDto;
import kz.lkiikq.telegramfinanceauth.service.AuthService;
import kz.lkiikq.telegramfinanceauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserService userService;

    public Boolean checkExistence(Long chatId) {
        return userService.getUserByChatId(chatId) != null;
    }

    public Boolean auth(UserDto userDto) {
        User user = userService.getUserByChatId(userDto.getChatId());
        if (user != null) {
            return user.getPassword().equals(userDto.getPassword());
        }
        return false;
    }

    public void registerUser(UserDto userDto) {
        User user = new User(userDto.getChatId(), userDto.getUsername(), userDto.getPassword());
        userService.saveUser(user);
    }

    public void deleteUser(Long chatId) {
        userService.deleteUser(chatId);
    }
}
