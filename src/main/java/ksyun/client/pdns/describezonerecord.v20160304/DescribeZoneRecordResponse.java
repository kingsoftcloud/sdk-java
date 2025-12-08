package ksyun.client.pdns.describezonerecord.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeZoneRecordResponse
* @Description DescribeZoneRecord 返回体
*/
@Data
@ToString
public class DescribeZoneRecordResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**记录信息*/
    @JsonProperty("RecordSet")
    private List<RecordSetDto> RecordSet;

    @Data
    @ToString
    public static class RecordSetDto {
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
        private List<RecordSetDtoRecordDataSetDto> RecordDataSet;

        @Data
        @ToString
        public static class RecordSetDtoRecordDataSetDto {
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
