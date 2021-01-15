package com.macro.cloud.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

/**
 * Created by macro on 2019/8/29.
 * 无法构造函数不能和@Builder注解同时使用，需要构造函数时需要@Tolerate默许
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class User {
    @ApiModelProperty("用户ID")
    private Long id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;

    @Tolerate
    public User() {
    }
}
