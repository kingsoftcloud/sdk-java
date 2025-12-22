package ksyun.client.aicp.querytokendata.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname QueryTokenDataRequest
 * @Description 请求参数
 */
@Data
public class QueryTokenDataRequest {
    /**
     * 开始时间，毫秒时间戳，仅支持最近180天内时间。
     */
    @KsYunField(name = "StartTimestamp")
    private Integer StartTimestamp;

    /**
     * 截止时间，毫秒时间戳
     */
    @KsYunField(name = "EndTimestamp")
    private Integer EndTimestamp;

    /**
     * 分页页长，最大10000
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * model 搜索关键词
     */
    @KsYunField(name = "ModelKeyword")
    private String ModelKeyword;

    /**
     * 搜索关键词
     */
    @KsYunField(name = "Keyword")
    private String Keyword;

    /**
     * 分组字段：
     * model-按模型分组；keyId-按apikey分组。
     */
    @KsYunField(name = "GroupBy")
    private String GroupBy;

    /**
     * 推理类型：normal-在线，batch-批量，web-在线体验，不传为查询全部。
     */
    @KsYunField(name = "ReasoningType")
    private String ReasoningType;

    /**
     * 页码，从1开始。
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 是否国际版：false-国内版，true-国际版
     */
    @KsYunField(name = "IsGlobalServer")
    private Boolean IsGlobalServer;

}
