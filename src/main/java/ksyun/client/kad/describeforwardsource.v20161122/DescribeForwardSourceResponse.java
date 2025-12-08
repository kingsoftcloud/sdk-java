package ksyun.client.kad.describeforwardsource.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeForwardSourceResponse
* @Description DescribeForwardSource 返回体
*/
@Data
@ToString
public class DescribeForwardSourceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("DescribeForwardSourceResponse")
    private DescribeForwardSourceResponseDto DescribeForwardSourceResponse;

    @Data
    @ToString
    public static class DescribeForwardSourceResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("ForwardSourceSet")
        private ForwardSourceSetDto ForwardSourceSet;

        @Data
        @ToString
        public static class ForwardSourceSetDto {
            /***/
            @JsonProperty("item")
            private ItemDto Item;

            @Data
            @ToString
            public static class ItemDto {
                /***/
                @JsonProperty("ForwardConfId")
                private String ForwardConfId;

                /***/
                @JsonProperty("ForwardSourceId")
                private String ForwardSourceId;

                /***/
                @JsonProperty("SourceIp")
                private String SourceIp;

                /***/
                @JsonProperty("SourcePort")
                private String SourcePort;

                /***/
                @JsonProperty("AutoReplace")
                private String AutoReplace;

                /***/
                @JsonProperty("RsRegion")
                private String RsRegion;

                /***/
                @JsonProperty("HealthMonitorStatusSet")
                private HealthMonitorStatusSetDto HealthMonitorStatusSet;

                @Data
                @ToString
                public static class HealthMonitorStatusSetDto {
                    /***/
                    @JsonProperty("item")
                    private ItemDto Item;

                    @Data
                    @ToString
                    public static class ItemDto {
                        /***/
                        @JsonProperty("Ip")
                        private String Ip;

                        /***/
                        @JsonProperty("Region")
                        private String Region;

                        /***/
                        @JsonProperty("Status")
                        private String Status;

                        /***/
                        @JsonProperty("LinkType")
                        private String LinkType;

                    }

                }

            }

        }

    }

}
