package ksyun.client.rabbitmq.describeinstances.v20191017;

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
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Offset")
        private Integer Offset;

        /***/
        @JsonProperty("Limit")
        private Integer Limit;

        /***/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /***/
            @JsonProperty("UserId")
            private String UserId;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("StatusName")
            private String StatusName;

            /***/
            @JsonProperty("ExpirationDate")
            private String ExpirationDate;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("Vip")
            private String Vip;

            /***/
            @JsonProperty("WebVip")
            private String WebVip;

            /***/
            @JsonProperty("InstanceType")
            private String InstanceType;

            /***/
            @JsonProperty("SsdDisk")
            private Integer SsdDisk;

            /***/
            @JsonProperty("Protocol")
            private String Protocol;

            /***/
            @JsonProperty("SecurityGroupId")
            private Integer SecurityGroupId;

            /***/
            @JsonProperty("Port")
            private String Port;

            /***/
            @JsonProperty("NetworkType")
            private String NetworkType;

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("ProductId")
            private String ProductId;

            /***/
            @JsonProperty("BillType")
            private String BillType;

            /***/
            @JsonProperty("CreateDate")
            private Integer CreateDate;

            /***/
            @JsonProperty("ProjectId")
            private String ProjectId;

            /***/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /***/
            @JsonProperty("NodeNum")
            private String NodeNum;

            /***/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("ProductWhat")
            private String ProductWhat;

            /***/
            @JsonProperty("Mode")
            private String Mode;

            /***/
            @JsonProperty("ModeName")
            private String ModeName;

            /***/
            @JsonProperty("Eip")
            private String Eip;

            /***/
            @JsonProperty("WebEip")
            private String WebEip;

            /***/
            @JsonProperty("EipEgress")
            private String EipEgress;

        }

    }

}
