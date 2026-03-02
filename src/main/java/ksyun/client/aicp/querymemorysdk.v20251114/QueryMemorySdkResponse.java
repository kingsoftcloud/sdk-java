package ksyun.client.aicp.querymemorysdk.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryMemorySdkResponse
* @Description QueryMemorySdk 返回体
*/
@Data
@ToString
public class QueryMemorySdkResponse extends BaseResponseModel {

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
        @JsonProperty("Memories")
        private List<DataMemoriesDto> Memories;

        @Data
        @ToString
        public static class DataMemoriesDto {
            /***/
            @JsonProperty("Query")
            private String Query;

            /***/
            @JsonProperty("TopicId")
            private String TopicId;

            /***/
            @JsonProperty("TopicName")
            private String TopicName;

            /***/
            @JsonProperty("MemoryId")
            private String MemoryId;

            /***/
            @JsonProperty("Memory")
            private String Memory;

            /***/
            @JsonProperty("Score")
            private Double Score;

            /***/
            @JsonProperty("OccurredStart")
            private Long OccurredStart;

            /***/
            @JsonProperty("OccurredEnd")
            private Long OccurredEnd;

            /***/
            @JsonProperty("Citations")
            private List<DataMemoriesCitationsDto> Citations;

            @Data
            @ToString
            public static class DataMemoriesCitationsDto {
                /***/
                @JsonProperty("DateType")
                private String DateType;

                /***/
                @JsonProperty("AgentId")
                private String AgentId;

                /***/
                @JsonProperty("Data")
                private DataMemoriesCitationsDataDto Data;

                @Data
                @ToString
                public static class DataMemoriesCitationsDataDto {
                    /***/
                    @JsonProperty("Datas")
                    private List<DataMemoriesCitationsDataDatasDto> Datas;

                    @Data
                    @ToString
                    public static class DataMemoriesCitationsDataDatasDto {
                        /***/
                        @JsonProperty("Text")
                        private String Text;

                        /***/
                        @JsonProperty("User")
                        private String User;

                        /***/
                        @JsonProperty("Timestamp")
                        private Long Timestamp;

                        /***/
                        @JsonProperty("MessageId")
                        private String MessageId;

                    }

                }

            }

        }

    }

}
