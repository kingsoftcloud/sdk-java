package ksyun.client.aicp.describetrainjobpodlogs.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTrainJobPodLogsRequest
* @Description 请求参数
*/
@Data
public class DescribeTrainJobPodLogsRequest{
    /**资源组ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**训练任务ID*/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

    /**Pod名称*/
    @KsYunField(name="PodName")
    private String PodName;

    /**日志时间范围，即查询多长时间以内的日志，单位秒*/
    @KsYunField(name="SinceSeconds")
    private Integer SinceSeconds;

    /**行数*/
    @KsYunField(name="TailLines")
    private Integer TailLines;

}
