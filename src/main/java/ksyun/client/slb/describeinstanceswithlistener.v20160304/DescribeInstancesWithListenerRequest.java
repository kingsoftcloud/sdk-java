package ksyun.client.slb.describeinstanceswithlistener.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeInstancesWithListenerRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstancesWithListenerRequest {
    /**
     * 多个后端服务器的ID
     */
    @KsYunField(name = "RegisterId")
    private List<String> RegisterIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;
    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    @KsYunField(name = "NextToken")
    private String NextToken;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - listener-id，监听器的ID
         * - real-server-ip，服务器的IP
         * - instance-id，实例ID
         * - status，真实服务器的状态
         * - network-interface-id，弹性网卡的ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }


}