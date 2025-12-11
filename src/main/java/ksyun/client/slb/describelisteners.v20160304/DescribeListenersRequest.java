package ksyun.client.slb.describelisteners.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeListenersRequest
* @Description 请求参数
*/
@Data
public class DescribeListenersRequest{
    /**多个监听器的ID*/
    @KsYunField(name="ListenerId",type=2)
    private List<String> ListenerIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： 
- load-balancer-id，负载均衡的ID
- load-balancer-acl-id，负载均衡ACL的ID
- listener-protocol，监听器的协议
- certificate-id，证书ID
- bind-type，监听器挂载类型*/
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
