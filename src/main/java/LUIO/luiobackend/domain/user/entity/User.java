package LUIO.luiobackend.domain.user.entity;

import lombok.Getter;

@Getter
public class User {

    private String userImageUrl;

    private String userIntroduce;

    public User(String userImageUrl, String userIntroduce) {
        this.userImageUrl = userImageUrl;
        this.userIntroduce = userIntroduce;
    }
}
