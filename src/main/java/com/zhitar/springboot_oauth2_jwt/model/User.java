package com.zhitar.springboot_oauth2_jwt.model;

import com.zhitar.springboot_oauth2_jwt.provider.AuthenticatonProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private AuthenticatonProvider authProvider;
}
