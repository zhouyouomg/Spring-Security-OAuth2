package com.zhouyou.security.distributed.uaa.model;

import lombok.Data;

import java.util.Objects;

/**
 * @author Administrator
 * @version 1.0
 **/
@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) &&
                Objects.equals(username, userDto.username) &&
                Objects.equals(password, userDto.password) &&
                Objects.equals(fullname, userDto.fullname) &&
                Objects.equals(mobile, userDto.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, fullname, mobile);
    }
}
