package ksyun.client.kscc.describeusercostsummary.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeUserCostSummaryRequest
* @Description 请求参数
*/
@Data
public class DescribeUserCostSummaryRequest{
    /**邮箱前缀，比如：zhangsan3*/
    @KsYunField(name="UserName")
    private String UserName;

}
