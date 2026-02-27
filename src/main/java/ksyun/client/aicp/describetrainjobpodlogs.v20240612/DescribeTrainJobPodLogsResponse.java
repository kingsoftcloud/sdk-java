package ksyun.client.aicp.describetrainjobpodlogs.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobPodLogsResponse
* @Description DescribeTrainJobPodLogs 返回体
*/
@Data
@ToString
public class DescribeTrainJobPodLogsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**日志内容。若资源组关联了Klog，请使用Klog的GetLogs接口查询*/
    @JsonProperty("PodLogs")
    private String PodLogs;

}
