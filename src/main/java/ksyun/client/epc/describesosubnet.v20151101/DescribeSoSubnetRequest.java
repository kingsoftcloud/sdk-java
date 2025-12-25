package ksyun.client.epc.describesosubnet.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSoSubnetRequest
* @Description 请求参数
*/
@Data
public class DescribeSoSubnetRequest{
    /**子网所属可用区的ID。*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**子网的名称。*/
    @KsYunField(name="SubnetName")
    private String SubnetName;

    /**子网所属VPC的ID。*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**子网的ID。
• 参数 - N：表示子网ID的序号，单次调用数量上限为100个。
• 多个ID之间用&分隔。*/
    @KsYunField(name = "SubnetIds", type = 1)
    private List<String> SubnetIdsList;

    /**分页查询凭证，用于标记分页的位置。
• 不填则从头开始查询。
• 传入之前调用本API返回的NextToken，则从该次API调用标记分页的位置往后开始查询。*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**查询的数量，默认为 10，最大为100。*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}
