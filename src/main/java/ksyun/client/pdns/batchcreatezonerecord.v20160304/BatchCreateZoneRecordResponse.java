package ksyun.client.pdns.batchcreatezonerecord.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchCreateZoneRecordResponse
* @Description BatchCreateZoneRecord 返回体
*/
@Data
@ToString
public class BatchCreateZoneRecordResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("RecordSet")
    private List<RecordSetDto> RecordSet;

    @Data
    @ToString
    public static class RecordSetDto {
        /***/
        @JsonProperty("RecordId")
        private String RecordId;

        /***/
        @JsonProperty("RecordName")
        private String RecordName;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("Type")
        private String Type;

        /***/
        @JsonProperty("RecordTtl")
        private Integer RecordTtl;

        /***/
        @JsonProperty("RecordDataSet")
        private List<RecordSetRecordDataSetDto> RecordDataSet;

        @Data
        @ToString
        public static class RecordSetRecordDataSetDto {
            /***/
            @JsonProperty("RecordValue")
            private String RecordValue;

            /**优先级*/
            @JsonProperty("Priority")
            private Integer Priority;

            /**权重*/
            @JsonProperty("Weight")
            private Integer Weight;

            /**端口*/
            @JsonProperty("Port")
            private Integer Port;

        }

    }

}
