package kz.lkiikq.telegramfinanceauth.service;

import kz.lkiikq.telegramfinanceauth.entity.User;

public interface UserService {
    User getUserByChatId(Long id);

    void saveUser(User user);

    void deleteUser(Long id);
}
