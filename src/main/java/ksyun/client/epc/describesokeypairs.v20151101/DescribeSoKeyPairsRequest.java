package ksyun.client.epc.describesokeypairs.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSoKeyPairsRequest
* @Description 请求参数
*/
@Data
public class DescribeSoKeyPairsRequest{
    /**密钥对的指纹。根据RFC4716定义的公钥指纹格式，采用MD5信息摘要算法。*/
    @KsYunField(name="FingerPrint")
    private String FingerPrint;

    /**密钥对ID，最多支持100个。
• 参数 - N：表示密钥对ID的序号。
• 多个密钥对ID之间用&分隔。
示例值：KeyPairIds.1=2c67be69-b508-48e4-a460-fe491e8d49ba*/
    @KsYunField(name="KeyPairIds",type=1)
    private List<String> KeyPairIdsList;

    /**密钥对名称，支持模糊搜索。*/
    @KsYunField(name="KeyPairName")
    private String KeyPairName;

    /**密钥对名称，最多支持100个。
• 参数 - N：表示密钥对的序号。
• 多个密钥对之间用&分隔。*/
    @KsYunField(name="KeyPairNames",type=1)
    private List<String> KeyPairNamesList;

    /**分页查询时设置的每页行数。
• 最大值：500
• 默认值：10*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页查询凭证，用于标记分页的位置，初次调用该接口时无需设置。下次查询时，取值为上一次API调用返回的NextToken参数值。*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}
