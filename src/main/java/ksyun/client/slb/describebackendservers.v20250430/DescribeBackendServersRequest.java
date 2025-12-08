package ksyun.client.slb.describebackendservers.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeBackendServersRequest
* @Description 请求参数
*/
@Data
public class DescribeBackendServersRequest{
    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： 
- backend-server-group-id，服务器组ID
- backend-server-ip，服务器ip
- instance-id，实例id
- network-interface-id，网卡id
*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**多个服务器ServerId*/
    @KsYunField(name="BackendServerId",type=2)
    private List<String> BackendServerIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
