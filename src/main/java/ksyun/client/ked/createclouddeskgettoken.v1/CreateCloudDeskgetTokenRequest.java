package ksyun.client.ked.createclouddeskgettoken.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateCloudDeskgetTokenRequest
* @Description 请求参数
*/
@Data
public class CreateCloudDeskgetTokenRequest{
    /**已分配的云电脑用户名*/
    @KsYunField(name="username")
    private String Username;

    /**密码请使用 base64 加密后传输*/
    @KsYunField(name="password")
    private String Password;

}
