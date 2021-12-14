package com.wzt.tapm.entity;

import lombok.*;
import lombok.experimental.Tolerate;

import java.io.Serializable;

/**
 * Basic user info(account, password, email, identity)
 */
@AllArgsConstructor
@ToString
public class UserBean implements Serializable {

    @NonNull
    @Getter
    @Setter
    private String account;

    @NonNull
    @Getter
    @Setter
    private String password;

    @NonNull
    @Getter
    @Setter
    private String email;

    @NonNull
    @Getter
    @Setter
    private int status;

    @Tolerate
    public UserBean() {
    }

}
