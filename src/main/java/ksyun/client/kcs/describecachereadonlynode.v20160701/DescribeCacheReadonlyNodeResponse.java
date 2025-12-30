package ksyun.client.kcs.describecachereadonlynode.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheReadonlyNodeResponse
* @Description DescribeCacheReadonlyNode 返回体
*/
@Data
@ToString
public class DescribeCacheReadonlyNodeResponse extends BaseResponseModel {

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
        @JsonProperty("instanceId")
        private String InstanceId;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("port")
        private Integer Port;

        /***/
        @JsonProperty("ip")
        private String Ip;

        /***/
        @JsonProperty("status")
        private String Status;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("proxy")
        private String Proxy;

        /***/
        @JsonProperty("area")
        private String Area;

        /***/
        @JsonProperty("shardId")
        private String ShardId;

    }

}
