package ksyun.client.kmr.listautoscalehistory.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAutoScaleHistoryResponse
* @Description ListAutoScaleHistory 返回体
*/
@Data
@ToString
public class ListAutoScaleHistoryResponse extends BaseResponseModel {

    /**请求ID，用于唯一标识一次请求*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**总记录数*/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("List")
        private List<DataListDto> List;

        @Data
        @ToString
        public static class DataListDto {
            /**记录ID*/
            @JsonProperty("Id")
            private Integer Id;

            /**扩展历史ID*/
            @JsonProperty("ScaleHistoryId")
            private String ScaleHistoryId;

            /**实例ID，用于唯一标识一个实例*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**策略ID*/
            @JsonProperty("PolicyId")
            private String PolicyId;

            /**策略名称*/
            @JsonProperty("PolicyName")
            private String PolicyName;

            /**计费类型，按量付费（按日月结）*/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /**扩展虚拟实例ID*/
            @JsonProperty("ScaleVirtualInstanceId")
            private String ScaleVirtualInstanceId;

            /**扩展订单ID*/
            @JsonProperty("ScaleOrderId")
            private String ScaleOrderId;

            /**节点类型*/
            @JsonProperty("NodeType")
            private String NodeType;

            /**执行动作，扩容还是缩容

- scale_out 扩容
- scale_in 缩容*/
            @JsonProperty("ScaleAction")
            private String ScaleAction;

            /**扩展节点数量*/
            @JsonProperty("ScaleNumber")
            private Integer ScaleNumber;

            /**执行状态*/
            @JsonProperty("Status")
            private String Status;

            /**缩容历史ID*/
            @JsonProperty("ScaleinHistoryId")
            private String ScaleinHistoryId;

            /**执行时间*/
            @JsonProperty("ExecAt")
            private String ExecAt;

            /**完成时间*/
            @JsonProperty("CompleteAt")
            private String CompleteAt;

        }

    }

}
