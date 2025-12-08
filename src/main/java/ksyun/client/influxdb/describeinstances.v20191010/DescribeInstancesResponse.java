package ksyun.client.influxdb.describeinstances.v20191010;

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
    @JsonProperty("Error")
    private String Error;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Offset")
        private Integer Offset;

        /***/
        @JsonProperty("Limit")
        private Integer Limit;

        /***/
        @JsonProperty("Data")
        private List<DataDto> Data;

        @Data
        @ToString
        public static class DataDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("RegionName")
            private String RegionName;

            /***/
            @JsonProperty("AvailabilityZoneName")
            private String AvailabilityZoneName;

            /***/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("EngineVersion")
            private String EngineVersion;

            /***/
            @JsonProperty("BillType")
            private Integer BillType;

            /***/
            @JsonProperty("BillTypeName")
            private String BillTypeName;

            /***/
            @JsonProperty("ProductWhat")
            private Integer ProductWhat;

            /***/
            @JsonProperty("Mode")
            private Integer Mode;

            /***/
            @JsonProperty("ModeName")
            private String ModeName;

            /***/
            @JsonProperty("InstanceType")
            private String InstanceType;

            /***/
            @JsonProperty("EbsType")
            private String EbsType;

            /***/
            @JsonProperty("EbsSize")
            private Integer EbsSize;

            /***/
            @JsonProperty("Vip")
            private String Vip;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("ExpirationTime")
            private String ExpirationTime;

            /***/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /***/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /***/
            @JsonProperty("UsedDisk")
            private String UsedDisk;

            /***/
            @JsonProperty("MaxDisk")
            private String MaxDisk;

            /***/
            @JsonProperty("Eip")
            private String Eip;

            /***/
            @JsonProperty("Eport")
            private Integer Eport;

        }

    }

}
