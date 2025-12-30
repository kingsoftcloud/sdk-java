package ksyun.client.kmr.createautoscalepolicy.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAutoScalePolicyResponse
* @Description CreateAutoScalePolicy 返回体
*/
@Data
@ToString
public class CreateAutoScalePolicyResponse extends BaseResponseModel {

    /**实例ID，用于唯一标识一个实例*/
    @JsonProperty("InstanceId")
    private String InstanceId;

    /**策略名称*/
    @JsonProperty("PolicyName")
    private String PolicyName;

    /**计费类型，按量付费*/
    @JsonProperty("ChargeType")
    private String ChargeType;

    /**执行周期，每天执行*/
    @JsonProperty("ExecuteCycle")
    private String ExecuteCycle;

    /***/
    @JsonProperty("ExecuteRules")
    private ExecuteRulesDto ExecuteRules;

    @Data
    @ToString
    public static class ExecuteRulesDto {
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

    /**节点类型*/
    @JsonProperty("NodeType")
    private String NodeType;

}
