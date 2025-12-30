package ksyun.client.kce.describeexistedinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeExistedInstancesResponse
* @Description DescribeExistedInstances 返回体
*/
@Data
@ToString
public class DescribeExistedInstancesResponse extends BaseResponseModel {

    /**存在的云服务器信息*/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**主网卡私有IP地*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**是否支持移入容器集群*/
        @JsonProperty("Available")
        private Boolean Available;

        /**不支持移入集群的原因*/
        @JsonProperty("UnavailableReason")
        private String UnavailableReason;

        /**集群id*/
        @JsonProperty("ClusterId")
        private String ClusterId;

    }

    /**实例数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**单次调用返回的最大数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0。*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
