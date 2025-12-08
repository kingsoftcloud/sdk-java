package ksyun.client.memcached.describecacheclusters.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCacheClustersResponse
* @Description DescribeCacheClusters 返回体
*/
@Data
@ToString
public class DescribeCacheClustersResponse extends BaseResponseModel {
    /***/
    @JsonProperty("reqId")
    private String ReqId;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("list")
        private List<ListDto> List;

        @Data
        @ToString
        public static class ListDto {
            /***/
            @JsonProperty("cacheId")
            private String CacheId;

            /***/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("securityGroupId")
            private String SecurityGroupId;

            /***/
            @JsonProperty("engine")
            private String Engine;

            /***/
            @JsonProperty("mode")
            private Integer Mode;

            /***/
            @JsonProperty("size")
            private Integer Size;

            /***/
            @JsonProperty("port")
            private Integer Port;

            /***/
            @JsonProperty("vip")
            private String Vip;

            /***/
            @JsonProperty("status")
            private Integer Status;

            /***/
            @JsonProperty("createTime")
            private String CreateTime;

            /***/
            @JsonProperty("netType")
            private Integer NetType;

            /***/
            @JsonProperty("vpcId")
            private String VpcId;

            /***/
            @JsonProperty("vnetId")
            private String VnetId;

            /***/
            @JsonProperty("iamProjectId")
            private String IamProjectId;

            /***/
            @JsonProperty("iamProjectName")
            private String IamProjectName;

        }

        /***/
        @JsonProperty("offset")
        private Integer Offset;

        /***/
        @JsonProperty("limit")
        private Integer Limit;

        /***/
        @JsonProperty("total")
        private Integer Total;

    }

}
