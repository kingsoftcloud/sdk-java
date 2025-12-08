package ksyun.client.dmp.describeinstancelist.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceListResponse
* @Description DescribeInstanceList 返回体
*/
@Data
@ToString
public class DescribeInstanceListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Page")
        private Integer Page;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("InstanceList")
        private List<InstanceListDto> InstanceList;

        @Data
        @ToString
        public static class InstanceListDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /***/
            @JsonProperty("DmpStatus")
            private String DmpStatus;

            /***/
            @JsonProperty("InstanceSource")
            private String InstanceSource;

            /***/
            @JsonProperty("InstanceRegion")
            private String InstanceRegion;

            /***/
            @JsonProperty("DatabaseType")
            private String DatabaseType;

            /***/
            @JsonProperty("DatabaseVersion")
            private String DatabaseVersion;

            /***/
            @JsonProperty("Mode")
            private String Mode;

            /***/
            @JsonProperty("Ips")
            private String Ips;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("ImportTime")
            private String ImportTime;

        }

    }

}
