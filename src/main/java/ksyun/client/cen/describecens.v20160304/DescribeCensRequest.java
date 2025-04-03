package ksyun.client.cen.describecens.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCensRequest
* @Description 请求参数
*/
@Data
public class DescribeCensRequest{
    /**多个云企业网的ID*/
    @KsYunField(name="CenId")
    private List<String> CenIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}