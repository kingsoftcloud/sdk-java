package ksyun.client.kmr.describeclusterinfo.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeClusterInfoResponse
 * @Description DescribeClusterInfo 返回体
 */
@Data
@ToString
public class DescribeClusterInfoResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
