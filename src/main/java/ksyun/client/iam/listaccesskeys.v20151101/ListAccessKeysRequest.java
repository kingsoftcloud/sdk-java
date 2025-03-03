package ksyun.client.iam.listaccesskeys.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListAccessKeysRequest
 * @Description 请求参数
 */
@Data
public class ListAccessKeysRequest {
    /**
     * IAM子用户名
     */
    @KsYunField(name = "UserName")
    private String UserName;

}