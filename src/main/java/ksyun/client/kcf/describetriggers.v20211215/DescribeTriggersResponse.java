package ksyun.client.kcf.describetriggers.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTriggersResponse
* @Description DescribeTriggers 返回体
*/
@Data
@ToString
public class DescribeTriggersResponse extends BaseResponseModel {
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
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("triggers")
        private List<DataDtoTriggersDto> Triggers;

        @Data
        @ToString
        public static class DataDtoTriggersDto {
            /**触发器 ID*/
            @JsonProperty("Id")
            private String Id;

            /**函数 ID*/
            @JsonProperty("FunctionId")
            private String FunctionId;

            /**触发器名称*/
            @JsonProperty("TriggerName")
            private String TriggerName;

            /**触发器类型*/
            @JsonProperty("Type")
            private String Type;

            /**公网地址*/
            @JsonProperty("UrlInternet")
            private String UrlInternet;

            /**vpc 内访问地址*/
            @JsonProperty("UrlIntranet")
            private String UrlIntranet;

            /***/
            @JsonProperty("TriggerDesc")
            private DataDtoTriggersDtoTriggerDescDto TriggerDesc;

            @Data
            @ToString
            public static class DataDtoTriggersDtoTriggerDescDto {
                /**是否开启验证*/
                @JsonProperty("AuthRequired")
                private Boolean AuthRequired;

                /**HTTP method*/
                @JsonProperty("Methods")
                private List<String> Methods;

            }

        }

    }

}
