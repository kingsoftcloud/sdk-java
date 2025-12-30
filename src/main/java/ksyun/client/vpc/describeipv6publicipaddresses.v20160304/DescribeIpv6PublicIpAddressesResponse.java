package ksyun.client.vpc.describeipv6publicipaddresses.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeIpv6PublicIpAddressesResponse
* @Description DescribeIpv6PublicIpAddresses 返回体
*/
@Data
@ToString
public class DescribeIpv6PublicIpAddressesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**IPV6公网的信息*/
    @JsonProperty("Ipv6PublicIpAddressSet")
    private List<Ipv6PublicIpAddressSetDto> Ipv6PublicIpAddressSet;

    @Data
    @ToString
    public static class Ipv6PublicIpAddressSetDto {
        /**带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**Ipv6公网地址*/
        @JsonProperty("Ipv6PublicIpAddress")
        private String Ipv6PublicIpAddress;

        /**Ipv6公网的ID*/
        @JsonProperty("Ipv6PublicIpAddressId")
        private String Ipv6PublicIpAddressId;

    }

}
