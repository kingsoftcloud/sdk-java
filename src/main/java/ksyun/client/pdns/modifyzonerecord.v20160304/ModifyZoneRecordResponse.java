package ksyun.client.pdns.modifyzonerecord.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyZoneRecordResponse
* @Description ModifyZoneRecord 返回体
*/
@Data
@ToString
public class ModifyZoneRecordResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**记录信息*/
    @JsonProperty("Record")
    private RecordDto Record;

    @Data
    @ToString
    public static class RecordDto {
        /**记录ID*/
        @JsonProperty("RecordId")
        private String RecordId;

        /**记录名称*/
        @JsonProperty("RecordName")
        private String RecordName;

        /**记录类型*/
        @JsonProperty("Type")
        private String Type;

        /**记录TTL*/
        @JsonProperty("RecordTtl")
        private Integer RecordTtl;

        /**所绑定的VPC的信息*/
        @JsonProperty("RecordDataSet")
        private List<RecordRecordDataSetDto> RecordDataSet;

        @Data
        @ToString
        public static class RecordRecordDataSetDto {
            /**记录值*/
            @JsonProperty("RecordValue")
            private String RecordValue;

            /**优先级,Type 为 MX、SRV 时此值有效, MX:[1,100]，SRV：[0,65535]*/
            @JsonProperty("Priority")
            private Integer Priority;

            /**权重,仅 Type 为 SRV 时有此值,[0,65535]*/
            @JsonProperty("Weight")
            private Integer Weight;

            /**端口,仅 Type 为 SRV 时有此值,[0,65535]*/
            @JsonProperty("Port")
            private Integer Port;

        }

    }

}
