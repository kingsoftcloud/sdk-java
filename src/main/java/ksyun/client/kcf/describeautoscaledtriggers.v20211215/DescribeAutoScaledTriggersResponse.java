package ksyun.client.kcf.describeautoscaledtriggers.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAutoScaledTriggersResponse
* @Description DescribeAutoScaledTriggers 返回体
*/
@Data
@ToString
public class DescribeAutoScaledTriggersResponse extends BaseResponseModel {

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
        @JsonProperty("Triggers")
        private List<DataTriggersDto> Triggers;

        @Data
        @ToString
        public static class DataTriggersDto {
            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Type")
            private String Type;

            /***/
            @JsonProperty("TriggerConfig")
            private DataTriggersTriggerConfigDto TriggerConfig;

            @Data
            @ToString
            public static class DataTriggersTriggerConfigDto {
                /***/
                @JsonProperty("QpsValue")
                private Integer QpsValue;

                /***/
                @JsonProperty("StartTime")
                private Integer StartTime;

                /***/
                @JsonProperty("EndTime")
                private Integer EndTime;

                /***/
                @JsonProperty("CronType")
                private String CronType;

                /***/
                @JsonProperty("MemoryType")
                private String MemoryType;

                /***/
                @JsonProperty("MemoryValue")
                private String MemoryValue;

                /***/
                @JsonProperty("DesiredReplicas")
                private Integer DesiredReplicas;

            }

        }

    }

}
