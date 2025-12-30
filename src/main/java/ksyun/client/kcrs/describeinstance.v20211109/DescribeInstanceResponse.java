package ksyun.client.kcrs.describeinstance.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceResponse
* @Description DescribeInstance 返回体
*/
@Data
@ToString
public class DescribeInstanceResponse extends BaseResponseModel {

    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("InstanceSet")
    private List<InstanceSetDto> InstanceSet;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**实例状态*/
        @JsonProperty("InstanceStatus")
        private String InstanceStatus;

        /**内部端点*/
        @JsonProperty("InternalEndpoint")
        private String InternalEndpoint;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**过期时间*/
        @JsonProperty("ExpiredTime")
        private String ExpiredTime;

        /**计价模式*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**每个分页的最大条目数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**当前分页*/
    @JsonProperty("Marker")
    private Integer Marker;

}
