package ksyun.client.kcrs.describeinternalendpointdns.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInternalEndpointDnsResponse
* @Description DescribeInternalEndpointDns 返回体
*/
@Data
@ToString
public class DescribeInternalEndpointDnsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**私网链接响应数据体*/
    @JsonProperty("InternalEndpointDnsSet")
    private List<InternalEndpointDnsSetDto> InternalEndpointDnsSet;

    @Data
    @ToString
    public static class InternalEndpointDnsSetDto {
        /**解析的域名，有效值：
PublicDomain：公网域名
PrivateDomain：内网域名*/
        @JsonProperty("InternalEndpointDns")
        private String InternalEndpointDns;

        /**解析状态，有效值：
Opening：解析中
Running：解析正常
Error：异常 
Closed：未解析*/
        @JsonProperty("Status")
        private String Status;

    }

}
