package ksyun.client.iam.deleteaccesskey.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteAccessKeyRequest
 * @Description 请求参数
 */
@Data
public class DeleteAccessKeyRequest {
    /**
     * IAM子用户的用户名
     */
    @KsYunField(name = "UserName")
    private String UserName;

    /**
     * 访问密钥ID
     */
    @KsYunField(name = "AccessKeyId")
    private String AccessKeyId;


}