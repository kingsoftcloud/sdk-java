package ksyun.client.kec.attachkey.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AttachKeyRequest
 * @Description 请求参数
 */
@Data
public class AttachKeyRequest {
    /**
     * 动作
     */
    @KsYunField(name = "Action")
    private String Action;

    /**
     * 待绑定密钥的实例。
     * 标准UUID格式，形如[1]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

    /**
     * 待绑定的密钥列表。
     * 标准UUID格式，形如[2]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$
     */
    @KsYunField(name = "KeyId")
    private List<String> KeyIdList;

}