package ksyun.client.rabbitmq.describeinstancenodes.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceNodesResponse
* @Description DescribeInstanceNodes 返回体
*/
@Data
@ToString
public class DescribeInstanceNodesResponse extends BaseResponseModel {

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
        @JsonProperty("NodeId")
        private String NodeId;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Role")
        private String Role;

        /***/
        @JsonProperty("Ip")
        private String Ip;

        /***/
        @JsonProperty("Port")
        private String Port;

        /***/
        @JsonProperty("StatusName")
        private String StatusName;

        /***/
        @JsonProperty("Status")
        private String Status;

    }

}
