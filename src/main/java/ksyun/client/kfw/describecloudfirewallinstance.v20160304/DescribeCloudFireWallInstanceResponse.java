package ksyun.client.kfw.describecloudfirewallinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCloudFireWallInstanceResponse
* @Description DescribeCloudFireWallInstance 返回体
*/
@Data
@ToString
public class DescribeCloudFireWallInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("cloudFireWallInstanceList")
    private List<CloudFireWallInstanceListDto> CloudFireWallInstanceList;

    @Data
    @ToString
    public static class CloudFireWallInstanceListDto {
        /***/
        @JsonProperty("instanceId")
        private String InstanceId;

        /***/
        @JsonProperty("instanceName")
        private String InstanceName;

        /***/
        @JsonProperty("instanceType")
        private String InstanceType;

        /***/
        @JsonProperty("bandwidth")
        private Integer Bandwidth;

        /***/
        @JsonProperty("status")
        private Integer Status;

        /***/
        @JsonProperty("totalEipNum")
        private Integer TotalEipNum;

        /***/
        @JsonProperty("usedEipNum")
        private Integer UsedEipNum;

        /***/
        @JsonProperty("ipsStatus")
        private Integer IpsStatus;

        /***/
        @JsonProperty("avStatus")
        private Integer AvStatus;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

    }

}
