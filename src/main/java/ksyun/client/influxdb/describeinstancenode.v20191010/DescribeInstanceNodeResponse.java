package ksyun.client.influxdb.describeinstancenode.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceNodeResponse
* @Description DescribeInstanceNode 返回体
*/
@Data
@ToString
public class DescribeInstanceNodeResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Id")
        private String Id;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Ip")
        private String Ip;

        /***/
        @JsonProperty("Vip")
        private String Vip;

        /***/
        @JsonProperty("Port")
        private Integer Port;

        /***/
        @JsonProperty("UsedMemory")
        private String UsedMemory;

        /***/
        @JsonProperty("MaxMemory")
        private String MaxMemory;

        /***/
        @JsonProperty("Role")
        private String Role;

    }

}
