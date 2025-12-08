package ksyun.client.kmr.listautoscalepolicy.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAutoScalePolicyResponse
* @Description ListAutoScalePolicy 返回体
*/
@Data
@ToString
public class ListAutoScalePolicyResponse extends BaseResponseModel {
    /**HTTP状态码，200表示请求成功*/
    @JsonProperty("status")
    private Integer Status;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**返回码，0表示成功，其他值表示错误*/
        @JsonProperty("Code")
        private Integer Code;

        /**返回信息，通常用于描述错误信息*/
        @JsonProperty("Message")
        private String Message;

        /**请求ID，用于唯一标识一次请求*/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Data")
        private List<DataDtoDataDto> Data;

        @Data
        @ToString
        public static class DataDtoDataDto {
            /**策略ID*/
            @JsonProperty("Id")
            private Integer Id;

            /**实例ID，用于唯一标识一个实例*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**策略ID*/
            @JsonProperty("PolicyId")
            private String PolicyId;

            /**策略名称*/
            @JsonProperty("PolicyName")
            private String PolicyName;

            /**计费类型，按量付费*/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /**执行周期，按日执行*/
            @JsonProperty("ExecuteCycle")
            private String ExecuteCycle;

            /**节点类型*/
            @JsonProperty("NodeType")
            private String NodeType;

            /**策略状态*/
            @JsonProperty("Status")
            private Integer Status;

            /***/
            @JsonProperty("ExecuteRules")
            private DataDtoDataDtoExecuteRulesDto ExecuteRules;

            @Data
            @ToString
            public static class DataDtoDataDtoExecuteRulesDto {
                /**开始时间*/
                @JsonProperty("StartTime")
                private String StartTime;

                /**结束时间*/
                @JsonProperty("EndTime")
                private String EndTime;

                /**扩展节点数量*/
                @JsonProperty("ScaleNum")
                private Integer ScaleNum;

            }

            /**策略创建时间*/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /**策略更新时间*/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

    }

    /**返回信息，表示请求成功*/
    @JsonProperty("message")
    private String Message;

}
