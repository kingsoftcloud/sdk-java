package ksyun.client.aicp.describemodelversions.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelVersionsRequest
* @Description 请求参数
*/
@Data
public class DescribeModelVersionsRequest{
    /**模型版本ID列表*/
    @KsYunField(name="ModelVersionId.N",type=2)
    private List<String> ModelVersionIdNList;

    /**模型版本名称(支持模糊查询)*/
    @KsYunField(name="ModelVersionName")
    private String ModelVersionName;

    /**模型ID*/
    @KsYunField(name="ModelId")
    private String ModelId;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
