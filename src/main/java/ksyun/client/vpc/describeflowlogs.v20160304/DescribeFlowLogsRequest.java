package ksyun.client.vpc.describeflowlogs.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFlowLogsRequest
* @Description 请求参数
*/
@Data
public class DescribeFlowLogsRequest{
    /**流日志的ID*/
    @KsYunField(name="FlowLogId",type=2)
    private List<String> FlowLogIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto1> FilterList;

    @Data
    @ToString
    public static class FilterDto1 {
        /**有效值：
 FlowLogName，流日志名称 
 ResourceId，捕获的流量的资源 ID 
 ProjectName，工程的名称 
 LogPoolName，日志池的名称*/
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
