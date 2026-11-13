package ksyun.client.aicp.describestructureddata.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeStructuredDataRequest
* @Description 请求参数
*/
@Data
public class DescribeStructuredDataRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档 ID*/
    @KsYunField(name="DocumentId")
    private String DocumentId;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**指定列查询，与 SearchValue 成对使用*/
    @KsYunField(name="SearchColumn")
    private String SearchColumn;

    /**查询列数据*/
    @KsYunField(name="SearchValue")
    private String SearchValue;

}
