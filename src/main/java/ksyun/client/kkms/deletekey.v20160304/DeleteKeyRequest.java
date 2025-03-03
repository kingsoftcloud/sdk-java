package ksyun.client.kkms.deletekey.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteKeyRequest
 * @Description 请求参数
 */
@Data
public class DeleteKeyRequest {
    /**
     * 客户主KEY的ID
     */
    @KsYunField(name = "KeyId")
    private String KeyId;

}