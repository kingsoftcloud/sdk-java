package ksyun.client.epc.describeshareimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeShareImageRequest
* @Description 请求参数
*/
@Data
public class DescribeShareImageRequest{
    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}