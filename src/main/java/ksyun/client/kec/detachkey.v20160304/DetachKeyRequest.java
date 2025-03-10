package ksyun.client.kec.detachkey.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DetachKeyRequest
 * @Description 请求参数
 */
@Data
public class DetachKeyRequest {
    /**
     * 动作
     */
    @KsYunField(name = "Action")
    private String Action;

    /**
     * 待解绑定密钥的实例。
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

    /**
     * 待解绑定的密钥。
     */
    @KsYunField(name = "KeyId")
    private List<String> KeyIdList;

}