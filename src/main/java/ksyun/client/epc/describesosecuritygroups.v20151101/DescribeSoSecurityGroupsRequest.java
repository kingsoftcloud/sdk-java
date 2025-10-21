package ksyun.client.epc.describesosecuritygroups.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSoSecurityGroupsRequest
* @Description 请求参数
*/
@Data
public class DescribeSoSecurityGroupsRequest{
    /**安全组所属VPC的ID。*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**安全组的ID列表。
• 参数 - N：表示安全组ID的序号，单次调用数量上限为100个。
• 多个安全组用&分隔。*/
    @KsYunField(name="SecurityGroupIds")
    private List<String> SecurityGroupIdsList;

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