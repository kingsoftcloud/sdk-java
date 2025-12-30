package ksyun.client.aicp.deleteapikey.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteApikeyRequest
* @Description 请求参数
*/
@Data
public class DeleteApikeyRequest{
    /**KeyId，例如：API-KEY-1158133806039134208*/
    @KsYunField(name="KeyId")
    private String KeyId;

}
