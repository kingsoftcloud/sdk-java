package ksyun.client.epc.deletesokeypairs.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSoKeyPairsRequest
* @Description 请求参数
*/
@Data
public class DeleteSoKeyPairsRequest{
    /**密钥对名称，最多支持100个。
• 参数 - N：表示密钥对的序号。
• 多个密钥对之间用&分隔。*/
    @KsYunField(name="KeyPairNames")
    private List<String> KeyPairNamesList;

}