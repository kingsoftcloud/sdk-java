package ksyun.client.sks.deletekey.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteKeyRequest
 * @Description 请求参数
 */
@Data
public class DeleteKeyRequest {
    /**
     * 密钥Id
     */
    @KsYunField(name = "KeyId")
    private String KeyId;


}