package ksyun.client.kce.describecluster.v20231115;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeClusterResponse
 * @Description DescribeCluster 返回体
 */
@Data
@ToString
public class DescribeClusterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
