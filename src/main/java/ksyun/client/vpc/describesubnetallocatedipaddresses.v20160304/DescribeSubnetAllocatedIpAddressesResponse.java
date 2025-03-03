package ksyun.client.vpc.describesubnetallocatedipaddresses.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeSubnetAllocatedIpAddressesResponse
 * @Description DescribeSubnetAllocatedIpAddresses 返回体
 */
@Data
@ToString
public class DescribeSubnetAllocatedIpAddressesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
