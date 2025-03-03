package ksyun.client.kce.describeepcforcluster.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeEpcForClusterResponse
 * @Description DescribeEpcForCluster 返回体
 */
@Data
@ToString
public class DescribeEpcForClusterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
