package ksyun.client.epc.describeepctrashes.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeEpcTrashesRequest
 * @Description 请求参数
 */
@Data
public class DescribeEpcTrashesRequest {
    /**
     * 单次调用可返回的最大条目数量. 传入返回的 NextToken 值可以获取剩余的其它条目. 这个值可以允许的范围是 5- 1000
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 获取另一页返回结果的 token
     */
    @KsYunField(name = "NextToken")
    private String NextToken;

}