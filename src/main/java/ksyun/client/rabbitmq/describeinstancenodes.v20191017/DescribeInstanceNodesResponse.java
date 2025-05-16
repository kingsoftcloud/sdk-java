package ksyun.client.rabbitmq.describeinstancenodes.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DescribeInstanceNodesResponse
 * @Description DescribeInstanceNodes 返回体
 */
@Data
@ToString
public class DescribeInstanceNodesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
