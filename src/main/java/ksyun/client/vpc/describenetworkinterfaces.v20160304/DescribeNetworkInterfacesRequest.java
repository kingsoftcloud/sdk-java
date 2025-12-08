package ksyun.client.vpc.describenetworkinterfaces.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNetworkInterfacesRequest
* @Description 请求参数
*/
@Data
public class DescribeNetworkInterfacesRequest{
    /**多个网卡的ID*/
    @KsYunField(name="NetworkInterfaceId",type=2)
    private List<String> NetworkInterfaceIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto1> FilterList;

    @Data
    @ToString
    public static class FilterDto1 {
        /**有效值：
- vpc-id，Vpc的ID
- subnet-id，子网ID
- securitygroup-id，安全组ID
- instance-type，实例类型
- instance-id，实例的ID
- private-ip-address，主私有IP地址
- availability-zone-name，可用区名称
- networkInterface-type，网卡类型(primary|extension)*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
