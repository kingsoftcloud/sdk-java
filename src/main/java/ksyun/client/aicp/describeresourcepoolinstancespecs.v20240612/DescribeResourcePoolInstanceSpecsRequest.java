package ksyun.client.aicp.describeresourcepoolinstancespecs.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeResourcePoolInstanceSpecsRequest
* @Description 请求参数
*/
@Data
public class DescribeResourcePoolInstanceSpecsRequest{
    /**资源组ID*/
    @KsYunField(name="ResourcePoolId")
    private String ResourcePoolId;

    /**GPU型号筛选：
- 不传：返回所有节点规格
- 空字符串：返回非GPU（CPU）节点规格
- 具体型号：返回指定GPU型号的节点规格*/
    @KsYunField(name="GPUModel")
    private String GPUModel;

    /**是否仅返回CPU节点规格：
- true：仅返回非GPU节点规格
- false或不传：返回所有节点规格
优先级高于 GPUModel*/
    @KsYunField(name="OnlyCPU")
    private Boolean OnlyCPU;

}
