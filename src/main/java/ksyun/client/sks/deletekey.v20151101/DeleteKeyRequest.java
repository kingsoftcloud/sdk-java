package ksyun.client.sks.deletekey.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteKeyRequest
* @Description 请求参数
*/
@Data
public class DeleteKeyRequest{
    /**密钥Id*/
    @KsYunField(name="KeyId")
    private String KeyId;

}
