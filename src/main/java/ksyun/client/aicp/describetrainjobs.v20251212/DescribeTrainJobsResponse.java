package ksyun.client.aicp.describetrainjobs.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeTrainJobsResponse
* @Description DescribeTrainJobs 返回体
*/
@Data
@ToString
public class DescribeTrainJobsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
