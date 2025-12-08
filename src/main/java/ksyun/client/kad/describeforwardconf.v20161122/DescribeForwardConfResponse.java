package ksyun.client.kad.describeforwardconf.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeForwardConfResponse
* @Description DescribeForwardConf 返回体
*/
@Data
@ToString
public class DescribeForwardConfResponse extends BaseResponseModel {
    /***/
    @JsonProperty("response")
    private ResponseDto Response;

    @Data
    @ToString
    public static class ResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("ForwardConfSet")
        private ForwardConfSetDto ForwardConfSet;

        @Data
        @ToString
        public static class ForwardConfSetDto {
            /***/
            @JsonProperty("item")
            private ItemDto Item;

            @Data
            @ToString
            public static class ItemDto {
                /***/
                @JsonProperty("KadId")
                private String KadId;

                /***/
                @JsonProperty("ForwardConfId")
                private String ForwardConfId;

                /***/
                @JsonProperty("ServicePort")
                private String ServicePort;

                /***/
                @JsonProperty("Cname")
                private String Cname;

                /***/
                @JsonProperty("Protocol")
                private String Protocol;

                /***/
                @JsonProperty("SourceCount")
                private String SourceCount;

                /***/
                @JsonProperty("HealthMonitor")
                private HealthMonitorDto HealthMonitor;

                @Data
                @ToString
                public static class HealthMonitorDto {
                    /***/
                    @JsonProperty("Switch")
                    private String SwitchField;

                    /***/
                    @JsonProperty("Rise")
                    private String Rise;

                    /***/
                    @JsonProperty("Fall")
                    private String Fall;

                    /***/
                    @JsonProperty("Delay")
                    private String Delay;

                }

            }

        }

    }

}
