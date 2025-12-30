package ksyun.client.aicp.describemodelquotas.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelQuotasRequest
* @Description 请求参数
*/
@Data
public class DescribeModelQuotasRequest{
    /**分页页码，从1开始*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**分页页长，最大100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**模型搜索关键词*/
    @KsYunField(name="Keyword")
    private String Keyword;

    /**文本模型/视觉模型*/
    @KsYunField(name="Type")
    private String Type;

}
