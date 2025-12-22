package ksyun.client.ked.userslist.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UserslistRequest
* @Description 请求参数
*/
@Data
public class UserslistRequest{
    /**每页条数
*/
    @KsYunField(name="size")
    private Integer Size;

    /**页码数*/
    @KsYunField(name="page")
    private Integer Page;

    /**用户名*/
    @KsYunField(name="username")
    private String Username;

    /**手机号*/
    @KsYunField(name="phone")
    private String Phone;

    /**邮箱*/
    @KsYunField(name="email")
    private String Email;

}
