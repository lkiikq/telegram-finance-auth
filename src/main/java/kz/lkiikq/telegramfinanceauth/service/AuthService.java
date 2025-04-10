package kz.lkiikq.telegramfinanceauth.service;

import kz.lkiikq.telegramfinanceauth.model.dto.UserDto;

public interface AuthService {
    Boolean checkExistence(Long chatId);
    Boolean auth(UserDto userDto);
    void registerUser(UserDto userDto);
    void deleteUser(Long chatId);
}
