package ksyun.client.kcs.createcachecluster.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCacheClusterResponse
* @Description CreateCacheCluster 返回体
*/
@Data
@ToString
public class CreateCacheClusterResponse extends BaseResponseModel {
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
        @JsonProperty("CacheId")
        private String CacheId;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Size")
        private String Size;

        /***/
        @JsonProperty("Port")
        private String Port;

        /***/
        @JsonProperty("SubOrderId")
        private String SubOrderId;

    }

}
