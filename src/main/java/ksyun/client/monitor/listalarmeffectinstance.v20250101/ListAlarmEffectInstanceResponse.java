package ksyun.client.monitor.listalarmeffectinstance.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAlarmEffectInstanceResponse
* @Description ListAlarmEffectInstance 返回体
*/
@Data
@ToString
public class ListAlarmEffectInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestID")
    private String RequestID;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Alarms")
    private List<AlarmsDto> Alarms;

    @Data
    @ToString
    public static class AlarmsDto {
        /***/
        @JsonProperty("AlarmID")
        private Integer AlarmID;

        /***/
        @JsonProperty("Product")
        private String Product;

        /***/
        @JsonProperty("AlarmTime")
        private String AlarmTime;

        /***/
        @JsonProperty("RecoveryTime")
        private String RecoveryTime;

        /***/
        @JsonProperty("RelatedProductSet")
        private List<AlarmsRelatedProductSetDto> RelatedProductSet;

        @Data
        @ToString
        public static class AlarmsRelatedProductSetDto {
            /***/
            @JsonProperty("ProductName")
            private String ProductName;

            /***/
            @JsonProperty("ResourceSet")
            private List<AlarmsRelatedProductSetResourceSetDto> ResourceSet;

            @Data
            @ToString
            public static class AlarmsRelatedProductSetResourceSetDto {
                /***/
                @JsonProperty("InstanceID")
                private String InstanceID;

                /***/
                @JsonProperty("InstanceName")
                private String InstanceName;

                /***/
                @JsonProperty("Project")
                private String Project;

                /***/
                @JsonProperty("Region")
                private String Region;

            }

        }

    }

}
