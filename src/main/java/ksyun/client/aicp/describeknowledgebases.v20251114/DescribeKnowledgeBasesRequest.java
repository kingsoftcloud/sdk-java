package ksyun.client.aicp.describeknowledgebases.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKnowledgeBasesRequest
* @Description 请求参数
*/
@Data
public class DescribeKnowledgeBasesRequest{
    /**页码（从 1 开始，默认 1）*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页条数（1-100，默认 20）*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**搜索关键词（目前仅支持文档名称模糊搜）*/
    @KsYunField(name="Keyword")
    private String Keyword;

}
