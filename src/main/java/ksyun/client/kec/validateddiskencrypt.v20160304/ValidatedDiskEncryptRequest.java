package ksyun.client.kec.validateddiskencrypt.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ValidatedDiskEncryptRequest
* @Description 请求参数
*/
@Data
public class ValidatedDiskEncryptRequest{
    /**用户id*/
    @KsYunField(name="AccountId")
    private String AccountId;


}