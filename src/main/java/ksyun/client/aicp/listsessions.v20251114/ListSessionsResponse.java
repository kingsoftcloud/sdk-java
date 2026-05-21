package ksyun.client.aicp.listsessions.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSessionsResponse
* @Description ListSessions 返回体
*/
@Data
@ToString
public class ListSessionsResponse extends BaseResponseModel {

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
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Items")
        private List<DataItemsDto> Items;

        @Data
        @ToString
        public static class DataItemsDto {
            /***/
            @JsonProperty("DataId")
            private String DataId;

            /***/
            @JsonProperty("Data")
            private DataItemsDataDto Data;

            @Data
            @ToString
            public static class DataItemsDataDto {
                /***/
                @JsonProperty("Conversation")
                private List<DataItemsDataConversationDto> Conversation;

                @Data
                @ToString
                public static class DataItemsDataConversationDto {
                    /***/
                    @JsonProperty("Role")
                    private String Role;

                    /***/
                    @JsonProperty("Text")
                    private String Text;

                    /***/
                    @JsonProperty("CreatedAt")
                    private Integer CreatedAt;

                }

                /**0
待提取
50
提取中
100
提取成功
-100
提取失败*/
                @JsonProperty("State")
                private Integer State;

            }

            /**毫秒时间戳*/
            @JsonProperty("CreatedAt")
            private Integer CreatedAt;

        }

    }

}
