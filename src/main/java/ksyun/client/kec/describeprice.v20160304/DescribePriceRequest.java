package ksyun.client.kec.describeprice.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePriceRequest
* @Description 请求参数
*/
@Data
public class DescribePriceRequest{
    /**实例套餐类型，如果调用时未指定实例套餐类型，默认值为I1.1A*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**云主机系统盘配置参数。若不指定该参数，则按照系统默认值进行分配。*/
    @KsYunField(name="SystemDisk.DiskSize")
    private String SystemDiskDiskSize;

    /**镜像ID。*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**计费类型，调用时需要明确指定，无默认值。*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，单位月*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**数据卷容量，单位GB，容量限制依据 实例套餐类型定义 变化，如果调用时未指定，则为相应实例套餐类型最小值。InstanceType为通用型主机N1、N2、N3或者为本地NVMe机型I4时，此参数不生效。。*/
    @KsYunField(name="DataDiskGb")
    private Integer DataDiskGb;

    /**数据盘（云盘）的类型，数据盘n的类型，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、E1、N1、N2、N3、S3、I3、C3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。*/
    @KsYunField(name="DataDisk")
    private List<DataDiskDto> DataDiskList;

    @Data
    @ToString
    public static class DataDiskDto {
        /**数据盘（云盘）的类型，数据盘n的类型，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、E1、N1、N2、N3、S3、I3、C3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。*/
        @KsYunField(name="Type")
        private String Type;
        /**第 n 个数据盘（云盘）的容量大小，n 的取值范围为 [1, 8]。只支持I2、I2联网增强、E1、N1、N2、N3、S3、I3、C3。DataDisk.n.Type与DataDisk.n.Size必须都填写才有效。*/
        @KsYunField(name="Size")
        private Integer Size;
    }

    /**最大实例数。*/
    @KsYunField(name="MaxCount")
    private Integer MaxCount;

    /**不能给默认值，不传默认按价格体系配置systemDisk属性中第一个创建*/
    @KsYunField(name="SystemDisk.DiskType")
    private String SystemDiskDiskType;


}