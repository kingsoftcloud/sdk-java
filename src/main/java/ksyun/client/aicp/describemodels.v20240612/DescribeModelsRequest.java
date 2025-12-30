package ksyun.client.aicp.describemodels.v20240612;

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
    /**分页页码，从1开始*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**分页页长，最大100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**模型类别筛选项*/
    @KsYunField(name="ModelCategory",type=1)
    private List<String> ModelCategoryList;

    /**模型供应商*/
    @KsYunField(name="Provider",type=1)
    private List<String> ProviderList;

    /**模型上下文长度
1 - 128k及以下
2 - 128k到256k
3 - 256k以上*/
    @KsYunField(name="ContextLength",type=1)
    private List<Integer> ContextLengthList;

    /**模型名称关键词*/
    @KsYunField(name="ModelName")
    private String ModelName;

}
