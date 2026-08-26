package ksyun.client.vpc.describepathtasks.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePathTasksRequest
* @Description 请求参数
*/
@Data
public class DescribePathTasksRequest{
    /**路径分析ID*/
    @KsYunField(name="PathId",type=1)
    private List<String> PathIdList;

    /**路径分析任务ID*/
    @KsYunField(name="PathTaskId",type=1)
    private List<String> PathTaskIdList;

    /**获取另一页返回结果的 token*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}
