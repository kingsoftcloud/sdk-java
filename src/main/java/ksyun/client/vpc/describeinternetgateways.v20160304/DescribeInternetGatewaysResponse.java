package ksyun.client.vpc.describeinternetgateways.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInternetGatewaysResponse
* @Description DescribeInternetGateways 返回体
*/
@Data
@ToString
public class DescribeInternetGatewaysResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**InternetGateway的信息列表*/
    @JsonProperty("InternetGatewaySet")
    private List<InternetGatewaySetDto> InternetGatewaySet;

    @Data
    @ToString
    public static class InternetGatewaySetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**InternetGateway的名称*/
        @JsonProperty("InternetGatewayName")
        private String InternetGatewayName;

        /**InternetGateway的ID*/
        @JsonProperty("InternetGatewayId")
        private String InternetGatewayId;

    }

}
