package ksyun.client.epc.describeprocesses.v20151101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeProcessesRequest
 * @Description 请求参数
 */
@Data
public class DescribeProcessesRequest {
    /**
     * 流程的ID
     */
    @KsYunField(name = "OperationProcessId")
    private List<String> OperationProcessIdList;

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
         * - sn，裸金属服务器资源序列号
         * - status，工单状态
         * - process-id，工单ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

}