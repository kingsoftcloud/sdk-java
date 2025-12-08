package ksyun.client.aicp.describetrainjobevents.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTrainJobEventsRequest
* @Description 请求参数
*/
@Data
public class DescribeTrainJobEventsRequest{
    /***/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /***/
    @KsYunField(name="TrainJobId")
    private String TrainJobId;

}
