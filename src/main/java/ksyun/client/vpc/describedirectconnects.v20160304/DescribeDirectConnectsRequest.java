package ksyun.client.vpc.describedirectconnects.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDirectConnectsRequest
* @Description 请求参数
*/
@Data
public class DescribeDirectConnectsRequest{
    /**物理端口ID*/
    @KsYunField(name="DirectConnectId",type=2)
    private List<String> DirectConnectIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
