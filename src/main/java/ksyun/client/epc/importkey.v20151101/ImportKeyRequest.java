package ksyun.client.epc.importkey.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ImportKeyRequest
* @Description 请求参数
*/
@Data
public class ImportKeyRequest{
    /**密钥名称*/
    @KsYunField(name="KeyName")
    private String KeyName;

    /**公钥信息*/
    @KsYunField(name="PublicKey")
    private String PublicKey;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;


}