package ksyun.client.iam.sendemailcode.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SendEmailCodeRequest
* @Description 请求参数
*/
@Data
public class SendEmailCodeRequest{
    /**子用户用户名*/
    @KsYunField(name="UserName")
    private String UserName;

}
