package ksyun.client.kec.attachkey.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AttachKeyRequest
* @Description 请求参数
*/
@Data
public class AttachKeyRequest{
    /**动作*/
    @KsYunField(name="Action")
    private String Action;

    /**待绑定密钥的实例。
标准UUID格式，形如[1]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$	*/
    @KsYunField(name="InstanceId",type=2)
    private List<String> InstanceIdList;

    /**待绑定的密钥列表。
标准UUID格式，形如[2]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$	*/
    @KsYunField(name="KeyId",type=2)
    private List<String> KeyIdList;

}
