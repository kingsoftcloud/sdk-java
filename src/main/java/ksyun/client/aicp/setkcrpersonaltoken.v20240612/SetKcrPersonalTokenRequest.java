package ksyun.client.aicp.setkcrpersonaltoken.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetKcrPersonalTokenRequest
* @Description 请求参数
*/
@Data
public class SetKcrPersonalTokenRequest{
    /**用户名*/
    @KsYunField(name="UserName")
    private String UserName;

    /**密码*/
    @KsYunField(name="Password")
    private String Password;

}
