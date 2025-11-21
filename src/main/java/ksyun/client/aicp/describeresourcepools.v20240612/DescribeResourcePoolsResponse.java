package ksyun.client.aicp.describeresourcepools.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeResourcePoolsResponse
* @Description DescribeResourcePools 返回体
*/
@Data
@ToString
public class DescribeResourcePoolsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
