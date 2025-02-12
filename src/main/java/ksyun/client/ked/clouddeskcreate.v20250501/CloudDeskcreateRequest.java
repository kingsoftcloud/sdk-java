package ksyun.client.ked.clouddeskcreate.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CloudDeskcreateRequest
* @Description 请求参数
*/
@Data
public class CloudDeskcreateRequest{
    /**云电脑名称*/
    @KsYunField(name="instanceName")
    private String InstanceName;

    /**云电脑类型
4C8G
4C8G_1G
8C16G
8C16G_1G
8C16G_2G
16C16G_2G
16C32G
16C32G_2G
8C16G3060
16C32G3060
16C64G3060*/
    @KsYunField(name="instanceType")
    private String InstanceType;

    /**镜像ID*/
    @KsYunField(name="imageId")
    private String ImageId;

    /**区域 id, 通过区域列表接口获取*/
    @KsYunField(name="edgeNodeId")
    private String EdgeNodeId;

    /**系统盘大小，单位 GB*/
    @KsYunField(name="systemDisk")
    private Integer SystemDisk;

    /**如果不需数据盘，传输 0 即可*/
    @KsYunField(name="dataDisk")
    private Integer DataDisk;

    /**计费模式
1: 包年包月
87: 按量付费
5：按量付费（按日月结）*/
    @KsYunField(name="billType")
    private Integer BillType;

    /**单位:月， 仅 billType 为包年包月时填写
*/
    @KsYunField(name="duration")
    private Integer Duration;

    /**策略 id
*/
    @KsYunField(name="securityGroupId")
    private String SecurityGroupId;

    /**gpu类型：0,FPGA,vGPU 1G,vGPU 2G,3060 12G独显,2080Ti 2G
默认是套餐编码对应的gpu*/
    @KsYunField(name="gpu")
    private String Gpu;

    /**默认1，创建实例台数*/
    @KsYunField(name="quantity")
    private Integer Quantity;

    /**是否为HostName和InstanceName添加有序后缀。有序后缀从001开始递增，最大不能超过999。例如：LocalHost001，LocalHost002和MyInstance001，MyInstance002。*/
    @KsYunField(name="uniqueSuffix")
    private Boolean UniqueSuffix;


}