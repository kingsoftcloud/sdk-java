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
public class DescribeBackendServersRequest {
    /**
     * 多个绑定服务器组的注册ID
     */
    @KsYunField(name = "RegisterId")
    private List<String> RegisterIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - vpc-id，Vpc的ID
         * - backend-server-group-type，后端服务器组类型
         * - protocol，后端协议
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

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

}