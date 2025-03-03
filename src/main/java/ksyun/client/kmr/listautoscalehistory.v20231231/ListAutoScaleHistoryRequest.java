package ksyun.client.kmr.listautoscalehistory.v20231231;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListAutoScaleHistoryRequest
 * @Description 请求参数
 */
@Data
public class ListAutoScaleHistoryRequest {
    /**
     * 实例ID，用于唯一标识一个实例
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 执行时间范围的起始时间
     */
    @KsYunField(name = "ExecAtStart")
    private String ExecAtStart;

    /**
     * 执行时间范围的结束时间
     */
    @KsYunField(name = "ExecAtEnd")
    private String ExecAtEnd;

    /**
     * 策略名称（左右模糊匹配）
     */
    @KsYunField(name = "PolicyName")
    private String PolicyName;

    /**
     * 页码，从0开始
     */
    @KsYunField(name = "PageNumber")
    private Integer PageNumber;

    /**
     * 每页记录数
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}