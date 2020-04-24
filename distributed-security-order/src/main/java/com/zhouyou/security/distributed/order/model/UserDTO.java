package com.zhouyou.security.distributed.order.model;

import lombok.Data;

/**
 * 用户信息
 */
@Data
public class UserDTO {

    /**
     * 用户id
     */
    private String id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String fullname;


    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                ", fullname='" + fullname + '\'' +
                '}';
    }

}
