package ksyun.client.epc.describemodelconfig.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeModelConfigRequest
* @Description 请求参数
*/
@Data
public class DescribeModelConfigRequest{
    /**单次调用可返回的最大条目数量. 传入返回的 NextToken 值可以获取剩余的其它条目. 这个值可以允许的范围是 5- 1000.
类型: Int
是否必填：否*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.
类型: String
是否必填：否*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**实例类型*/
    @KsYunField(name="HostType")
    private String HostType;

    /**gpu驱动ID*/
    @KsYunField(name="GpuImageDriverId")
    private String GpuImageDriverId;

}
