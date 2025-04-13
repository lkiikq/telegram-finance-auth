package kz.lkiikq.telegramfinanceauth.controller;

import kz.lkiikq.telegramfinanceauth.model.dto.UserDto;
import kz.lkiikq.telegramfinanceauth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @GetMapping(path = "/check-existence/{chatId}", produces = "application/json")
    public Boolean checkExistence(@PathVariable Long chatId) {
        return authService.checkExistence(chatId);
    }

    @PostMapping(path = "/register")
    public void registerUser(@RequestBody UserDto userDto) {
        authService.registerUser(userDto);
    }

    @PostMapping(path = "/auth", produces = "application/json")
    public Boolean auth(@RequestBody UserDto userDto) {
        return authService.auth(userDto);
    }

    @DeleteMapping(path = "/delete/{chatId}")
    public void deleteUser(@PathVariable Long chatId) {
        authService.deleteUser(chatId);
    }
}
