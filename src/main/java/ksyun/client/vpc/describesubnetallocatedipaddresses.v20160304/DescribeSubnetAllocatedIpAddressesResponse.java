package ksyun.client.vpc.describesubnetallocatedipaddresses.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSubnetAllocatedIpAddressesResponse
* @Description DescribeSubnetAllocatedIpAddresses 返回体
*/
@Data
@ToString
public class DescribeSubnetAllocatedIpAddressesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**IP地址列表*/
    @JsonProperty("AvailableIpAddress")
    private List<String> AvailableIpAddress;

}
