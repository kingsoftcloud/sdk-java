package ksyun.client.slb.describebackendservergroups.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeBackendServerGroupsRequest
* @Description 请求参数
*/
@Data
public class DescribeBackendServerGroupsRequest{
    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： 
- vpc-id，Vpc的ID
- backend-server-type，服务器类型
- protocol 协议类型*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**多个服务器组id*/
    @KsYunField(name="BackendServerGroupId",type=2)
    private List<String> BackendServerGroupIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
