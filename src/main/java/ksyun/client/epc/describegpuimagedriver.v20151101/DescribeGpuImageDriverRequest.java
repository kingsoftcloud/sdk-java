package ksyun.client.epc.describegpuimagedriver.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeGpuImageDriverRequest
* @Description 请求参数
*/
@Data
public class DescribeGpuImageDriverRequest{
    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**云物理主机类型*/
    @KsYunField(name="HostType")
    private String HostType;


}