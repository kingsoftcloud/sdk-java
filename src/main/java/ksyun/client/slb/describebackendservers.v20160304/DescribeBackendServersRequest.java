package ksyun.client.slb.describebackendservers.v20160304;

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
    /**多个绑定服务器组的注册ID*/
    @KsYunField(name="RegisterId")
    private List<String> RegisterIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- real-server-ip，真实服务器的IP
- instance-id，服务器的ID
 -backend-server-group-id，所属服务器组的ID
- network-interface-id，弹性网卡的ID*/
        @KsYunField(name="Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;


}