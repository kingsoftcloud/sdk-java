package ksyun.client.slb.describeloadbalancers.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeLoadBalancersResponse
* @Description DescribeLoadBalancers 返回体
*/
@Data
@ToString
public class DescribeLoadBalancersResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
