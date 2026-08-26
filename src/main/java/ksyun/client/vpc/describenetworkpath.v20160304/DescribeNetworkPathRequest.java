package ksyun.client.vpc.describenetworkpath.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNetworkPathRequest
* @Description 请求参数
*/
@Data
public class DescribeNetworkPathRequest{
    /**路径分析ID*/
    @KsYunField(name="PathId",type=1)
    private List<String> PathIdList;

}
