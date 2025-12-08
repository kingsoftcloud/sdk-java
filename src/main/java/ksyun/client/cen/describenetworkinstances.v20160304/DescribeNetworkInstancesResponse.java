package ksyun.client.cen.describenetworkinstances.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNetworkInstancesResponse
* @Description DescribeNetworkInstances 返回体
*/
@Data
@ToString
public class DescribeNetworkInstancesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**云企业网关联实例的信息*/
    @JsonProperty("NetworkInstanceSet")
    private List<NetworkInstanceSetDto> NetworkInstanceSet;

    @Data
    @ToString
    public static class NetworkInstanceSetDto {
        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**云企业网网络实例的ID*/
        @JsonProperty("NetworkInstanceId")
        private String NetworkInstanceId;

        /**网络实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**网络实例所属地域*/
        @JsonProperty("InstanceRegion")
        private String InstanceRegion;

        /**网络实例所属账号ID*/
        @JsonProperty("InstanceAccountId")
        private String InstanceAccountId;

        /**网络实例的创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
