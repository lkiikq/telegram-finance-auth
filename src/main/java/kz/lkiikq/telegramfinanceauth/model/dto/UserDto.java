package kz.lkiikq.telegramfinanceauth.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    @JsonProperty("chat_id")
    private Long chatId;
    private String username;
    private String password;
}
