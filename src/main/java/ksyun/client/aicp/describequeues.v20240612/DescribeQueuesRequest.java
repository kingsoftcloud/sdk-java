package ksyun.client.aicp.describequeues.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeQueuesRequest
* @Description 请求参数
*/
@Data
public class DescribeQueuesRequest{
    /**队列ID列表*/
    @KsYunField(name="QueueId",type=1)
    private List<String> QueueIdList;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：

- resource-pool-id，资源组的ID
- queue-name，队列名称
- workload-type，队列负载类型（Notebook，开发任务;TrainJob，训练任务;Inference，模型在线服务;DataJob，数据处理任务）
- state 队列状态（normal 可用，abnormal 不可用）
- queue-type，队列类型（normal 普通队列，physical 物理队列）*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

}
