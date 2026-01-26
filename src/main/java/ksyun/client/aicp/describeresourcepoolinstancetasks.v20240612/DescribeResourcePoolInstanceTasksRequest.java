package ksyun.client.aicp.describeresourcepoolinstancetasks.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeResourcePoolInstanceTasksRequest
 * @Description 请求参数
 */
@Data
public class DescribeResourcePoolInstanceTasksRequest {
    /**
     * 节点所在资源组ID
     */
    @KsYunField(name = "ResourcePoolId")
    private String ResourcePoolId;

    /**
     * 节点ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 任务类型：
     * - Notebook，开发任务
     * - TrainJob，训练任务
     * - Inference，模型在线服务
     * - DataJob，数据处理任务
     */
    @KsYunField(name = "TaskType")
    private String TaskType;

    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

    /**
     * 页码
     */
    @KsYunField(name = "Page")
    private Integer Page;

}
