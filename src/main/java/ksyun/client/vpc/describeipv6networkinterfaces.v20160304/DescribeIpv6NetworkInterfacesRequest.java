package ksyun.client.vpc.describeipv6networkinterfaces.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeIpv6NetworkInterfacesRequest
* @Description 请求参数
*/
@Data
public class DescribeIpv6NetworkInterfacesRequest{
    /**多个网卡的ID*/
    @KsYunField(name="NetworkInterfaceId",type=1)
    private List<String> NetworkInterfaceIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- vpc-id，Vpc的ID
- subnet-id，子网ID
- securitygroup-id，安全组ID
- instance-id，实例的ID*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
