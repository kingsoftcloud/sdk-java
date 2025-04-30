package ksyun.client.epc.describegpurocetopology.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeGpuRoceTopologyRequest
* @Description 请求参数
*/
@Data
public class DescribeGpuRoceTopologyRequest{
    /**Spine名称*/
    @KsYunField(name="SpineName")
    private String SpineName;

}