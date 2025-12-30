package ksyun.client.kcrs.describeinternalendpoint.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInternalEndpointResponse
* @Description DescribeInternalEndpoint 返回体
*/
@Data
@ToString
public class DescribeInternalEndpointResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**总条目数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("AccessVpcSet")
    private List<AccessVpcSetDto> AccessVpcSet;

    @Data
    @ToString
    public static class AccessVpcSetDto {
        /**虚拟私有网络ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**状态*/
        @JsonProperty("Status")
        private String Status;

        /**内网解析IP*/
        @JsonProperty("EniLBIp")
        private String EniLBIp;

    }

}
