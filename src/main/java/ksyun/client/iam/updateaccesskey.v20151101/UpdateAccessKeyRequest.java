package ksyun.client.iam.updateaccesskey.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UpdateAccessKeyRequest
 * @Description 请求参数
 */
@Data
public class UpdateAccessKeyRequest {
    /**
     * 访问密钥ID
     */
    @KsYunField(name = "AccessKeyId")
    private String AccessKeyId;

    /**
     * IAM子用户的用户名
     */
    @KsYunField(name = "UserName")
    private String UserName;

    /**
     * 修改后的访问密钥的状态，Active为可用，Inactive为不可用
     */
    @KsYunField(name = "Status")
    private String Status;

}