package ksyun.client.aicp.describemodels.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelsRequest
* @Description 请求参数
*/
@Data
public class DescribeModelsRequest{
    /**模型ID列表*/
    @KsYunField(name="ModelId.N",type=2)
    private List<String> ModelIdNList;

    /**模型名称(支持模糊查询)*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
