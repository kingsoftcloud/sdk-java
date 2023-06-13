package ksyun.client.slb.describeprivatelinkserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePrivateLinkServerRequest
* @Description 请求参数
*/
@Data
public class DescribePrivateLinkServerRequest{
    /**PrivateLinkServer的ID*/
    @KsYunField(name="PrivateLinkServerId")
    private List<String> PrivateLinkServerIdList;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private List<String> ProjectIdList;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;


}