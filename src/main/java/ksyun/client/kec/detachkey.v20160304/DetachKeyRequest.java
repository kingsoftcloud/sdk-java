package ksyun.client.kec.detachkey.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachKeyRequest
* @Description 请求参数
*/
@Data
public class DetachKeyRequest{
    /**动作*/
    @KsYunField(name="Action")
    private String Action;

    /**待解绑定密钥的实例。
*/
    @KsYunField(name="InstanceId",type=1)
    private List<String> InstanceIdList;

    /**待解绑定的密钥。
*/
    @KsYunField(name="KeyId",type=1)
    private List<String> KeyIdList;

}
