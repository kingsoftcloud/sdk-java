package ksyun.client.kec.describekecinventory.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKecInventoryRequest
* @Description 请求参数
*/
@Data
public class DescribeKecInventoryRequest{
    /**实例类型*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**数据卷容量，单位GB*/
    @KsYunField(name="DataDiskGb")
    private Integer DataDiskGb;

    /**系统盘大小*/
    @KsYunField(name="SystemDisk.DiskSize")
    private Integer SystemDiskDiskSize;

    /**系统盘类型*/
    @KsYunField(name="SystemDisk.DiskType")
    private String SystemDiskDiskType;

    /**可用区信息*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

}