package ksyun.client.sks.modifykey.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyKeyRequest
* @Description 请求参数
*/
@Data
public class ModifyKeyRequest{
    /**密钥名称*/
    @KsYunField(name="KeyName")
    private String KeyName;

    /**密钥Id*/
    @KsYunField(name="KeyId")
    private String KeyId;

}
