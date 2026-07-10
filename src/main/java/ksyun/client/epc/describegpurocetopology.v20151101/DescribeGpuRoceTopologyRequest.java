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

    /**leaf交换机名称*/
    @KsYunField(name="LeafName")
    private String LeafName;

    /**服务器实例ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**服务器sn*/
    @KsYunField(name="Sn")
    private String Sn;

    /**Roce集群名称*/
    @KsYunField(name="RoceCluster")
    private String RoceCluster;

    /**SRoce集群名称*/
    @KsYunField(name="SRoceCluster")
    private String SRoceCluster;

}
