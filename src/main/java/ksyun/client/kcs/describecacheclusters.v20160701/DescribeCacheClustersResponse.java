package ksyun.client.kcs.describecacheclusters.v20160701;

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
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
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
            @JsonProperty("region")
            private String Region;

            /***/
            @JsonProperty("az")
            private String Az;

            /***/
            @JsonProperty("name")
            private String Name;

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
            @JsonProperty("billType")
            private Integer BillType;

            /***/
            @JsonProperty("orderType")
            private Integer OrderType;

            /***/
            @JsonProperty("source")
            private Integer Source;

            /***/
            @JsonProperty("serviceStatus")
            private Integer ServiceStatus;

            /***/
            @JsonProperty("serviceBeginTime")
            private String ServiceBeginTime;

            /***/
            @JsonProperty("serviceEndTime")
            private String ServiceEndTime;

            /***/
            @JsonProperty("iamProjectId")
            private String IamProjectId;

            /***/
            @JsonProperty("iamProjectName")
            private String IamProjectName;

            /***/
            @JsonProperty("protocol")
            private String Protocol;

            /***/
            @JsonProperty("eip")
            private String Eip;

            /***/
            @JsonProperty("eipRo")
            private String EipRo;

            /**[
                    {
                        "tagId": "3***2",
                        "tagKey": "w***st",
                        "tagValue": "12***32"
                    }
                ]*/
            @JsonProperty("tags")
            private List<TagsDto> Tags;

            @Data
            @ToString
            public static class TagsDto {
            }

            /***/
            @JsonProperty("area")
            private String Area;

            /***/
            @JsonProperty("directVips")
            private String DirectVips;

            /***/
            @JsonProperty("directSupported")
            private String DirectSupported;

            /***/
            @JsonProperty("directConnEnabled")
            private Integer DirectConnEnabled;

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
