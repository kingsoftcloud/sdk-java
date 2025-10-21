package ksyun.client.epc.deletesoinstance.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSoInstanceRequest
* @Description 请求参数
*/
@Data
public class DeleteSoInstanceRequest{
    /**实例ID，最多支持100个ID。
• 参数 - N：表示实例的序号。
• 多个Instance ID之间用&分隔。*/
    @KsYunField(name="InstanceIds")
    private List<String> InstanceIdsList;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}