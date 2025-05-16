package ksyun.client.kkms.encrypt.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname EncryptRequest
 * @Description 请求参数
 */
@Data
public class EncryptRequest {
    /**
     * 客户主KEY的ID
     */
    @KsYunField(name = "KeyId")
    private String KeyId;

    /**
     * 明文数据，最多长度不超过4096
     */
    @KsYunField(name = "Plaintext")
    private String Plaintext;

}