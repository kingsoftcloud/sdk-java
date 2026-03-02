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
public class QueryTokenDataRequest{
    /**开始时间，毫秒时间戳*/
    @KsYunField(name="StartTimestamp")
    private Long StartTimestamp;

    /**截止时间，毫秒时间戳*/
    @KsYunField(name="EndTimestamp")
    private Long EndTimestamp;

    /**分页用的游标，表示上次已经获取到的数据，当前请求可以取上次返回结果的LastKey，首页时不传*/
    @KsYunField(name="LastKey")
    private String LastKey;

    /**分页页长，最大10000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**model 搜索关键词*/
    @KsYunField(name="ModelKeyword")
    private String ModelKeyword;

    /**搜索关键词*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**分组字段：model、keyId*/
    @KsYunField(name="GroupBy")
    private String GroupBy;

    /**推理类型：normal-在线，batch-批量，web-在线体验，为空表示全部。*/
    @KsYunField(name="ReasoningType")
    private String ReasoningType;

    /**页码，从1开始。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**模型名称
- 当按照模型分组时，Keyword优先，Keyword为空再以该字段筛选
- 当按照APIKEY分组时，该字段始终生效*/
    @KsYunField(name="ModelName")
    private String ModelName;

}
