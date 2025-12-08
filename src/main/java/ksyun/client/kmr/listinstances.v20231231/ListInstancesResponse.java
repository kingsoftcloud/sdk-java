package ksyun.client.kmr.listinstances.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstancesResponse
* @Description ListInstances 返回体
*/
@Data
@ToString
public class ListInstancesResponse extends BaseResponseModel {
    /**返回码，0表示成功，其他值表示错误*/
    @JsonProperty("Code")
    private Integer Code;

    /**返回信息，通常用于描述错误信息*/
    @JsonProperty("Message")
    private String Message;

    /**请求ID，用于唯一标识一次请求*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例总数*/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("List")
        private List<ListDto> List;

        @Data
        @ToString
        public static class ListDto {
            /**实例ID，用于唯一标识一个实例*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**实例名称*/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /**实例状态*/
            @JsonProperty("InstanceStatus")
            private String InstanceStatus;

            /**账户ID*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**实例开始时间*/
            @JsonProperty("BeginTime")
            private String BeginTime;

            /**持续时间*/
            @JsonProperty("Duration")
            private Integer Duration;

            /**持续时间单位字典*/
            @JsonProperty("DurationUnitDic")
            private Integer DurationUnitDic;

            /**运行时间*/
            @JsonProperty("RunningTime")
            private Integer RunningTime;

            /**可用区*/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /**区域*/
            @JsonProperty("Region")
            private String Region;

            /**VPC ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**VPC子网ID*/
            @JsonProperty("VpcSubnetId")
            private String VpcSubnetId;

            /**套餐类型*/
            @JsonProperty("PackageType")
            private String PackageType;

            /**计费类型*/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /**运行模式*/
            @JsonProperty("RunMode")
            private String RunMode;

            /***/
            @JsonProperty("ResourceSpec")
            private ResourceSpecDto ResourceSpec;

            @Data
            @ToString
            public static class ResourceSpecDto {
                /**前端节点数量*/
                @JsonProperty("Fe")
                private Integer Fe;

                /**计算节点数量*/
                @JsonProperty("Cn")
                private Integer Cn;

            }

        }

    }

}
