package ksyun.client.cen.describenetworkinstances.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNetworkInstancesRequest
* @Description 请求参数
*/
@Data
public class DescribeNetworkInstancesRequest{
    /**多个云企业网关联的实例ID的ID*/
    @KsYunField(name="NetworkInstanceId",type=1)
    private List<String> NetworkInstanceIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： 
- cen-id，云企业网ID
- network-instance-id，网络实例ID
- instance-type，实例类型
- region，金山云机房Code
- instance-account-id，实例账号ID*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
