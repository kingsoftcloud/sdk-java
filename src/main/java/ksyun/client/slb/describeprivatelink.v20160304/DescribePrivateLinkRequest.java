package ksyun.client.slb.describeprivatelink.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePrivateLinkRequest
* @Description 请求参数
*/
@Data
public class DescribePrivateLinkRequest{
    /**PrivateLinkId的ID*/
    @KsYunField(name="PrivateLinkId",type=1)
    private List<String> PrivateLinkIdList;

    /**项目的ID*/
    @KsYunField(name="ProjectId",type=1)
    private List<String> ProjectIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
