package ksyun.client.kce.describeeventlogs.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeEventLogsResponse
* @Description DescribeEventLogs 返回体
*/
@Data
@ToString
public class DescribeEventLogsResponse extends BaseResponseModel {
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
        @JsonProperty("ClusterId")
        private String ClusterId;

        /***/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("EventLogs")
        private DataDtoEventLogsDto EventLogs;

        @Data
        @ToString
        public static class DataDtoEventLogsDto {
            /***/
            @JsonProperty("RuntimeInfo")
            private DataDtoEventLogsDtoRuntimeInfoDto RuntimeInfo;

            @Data
            @ToString
            public static class DataDtoEventLogsDtoRuntimeInfoDto {
                /***/
                @JsonProperty("RuntimeName")
                private String RuntimeName;

                /***/
                @JsonProperty("RuntimeIP")
                private String RuntimeIP;

                /***/
                @JsonProperty("NodeIP")
                private String NodeIP;

            }

            /***/
            @JsonProperty("UserInfo")
            private DataDtoEventLogsDtoUserInfoDto UserInfo;

            @Data
            @ToString
            public static class DataDtoEventLogsDtoUserInfoDto {
                /***/
                @JsonProperty("AccountId")
                private String AccountId;

                /***/
                @JsonProperty("Region")
                private String Region;

            }

            /***/
            @JsonProperty("EventInfo")
            private DataDtoEventLogsDtoEventInfoDto EventInfo;

            @Data
            @ToString
            public static class DataDtoEventLogsDtoEventInfoDto {
                /***/
                @JsonProperty("EventId")
                private String EventId;

                /***/
                @JsonProperty("ClusterId")
                private String ClusterId;

                /***/
                @JsonProperty("EventType")
                private String EventType;

                /***/
                @JsonProperty("Level")
                private String Level;

                /***/
                @JsonProperty("CreatedTime")
                private String CreatedTime;

                /***/
                @JsonProperty("Content")
                private String Content;

                /***/
                @JsonProperty("Category")
                private Integer Category;

            }

        }

    }

}
