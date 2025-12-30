package ksyun.client.trade.describeinstances.v20200114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstancesResponse
* @Description DescribeInstances 返回体
*/
@Data
@ToString
public class DescribeInstancesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**计费方式*/
        @JsonProperty("billType")
        private Integer BillType;

        /**实例的创建时间*/
        @JsonProperty("createTime")
        private String CreateTime;

        /**实例ID*/
        @JsonProperty("instanceId")
        private String InstanceId;

        /**实例类型*/
        @JsonProperty("instanceType")
        private Integer InstanceType;

        /**实例的服务开通时间*/
        @JsonProperty("serviceBeginTime")
        private String ServiceBeginTime;

        /**实例的状态*/
        @JsonProperty("status")
        private Integer Status;

    }

}
