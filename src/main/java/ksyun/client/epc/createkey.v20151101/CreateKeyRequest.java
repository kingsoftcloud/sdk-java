package ksyun.client.epc.createkey.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateKeyRequest
* @Description 请求参数
*/
@Data
public class CreateKeyRequest{
    /**密钥名称*/
    @KsYunField(name="KeyName")
    private String KeyName;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

}
