package ksyun.client.epc.createsoimage.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateSoImageRequest
 * @Description 请求参数
 */
@Data
public class CreateSoImageRequest {
    /**
     * 重启实例前是否强制关机，取值：
     * • true：强制关机。相当于典型的断电操作，所有未写入存储设备的缓存数据会丢失。
     * • false（默认）：正常关机。
     * 说明
     * 以下类型的实例，ForceStop无论取值为true还是false，实例均会执行强制关机。
     * • 弹性裸金属实例。
     * • 高性能计算GPU型ebmhpcpni2l 、ebmhpcpni2、ebmhpchfpni2实例。
     * 示例值：false
     */
    @KsYunField(name = "ForceStop")
    private Boolean ForceStop;

    /**
     * 实例ID，最多支持100个ID。
     * • 参数 - N：表示实例的序号。
     * • 多个Instance ID之间用&分隔。
     * 示例值：InstanceIds.1=8981d45e-b3dc-44c6-b02f-2d1969551316&InstanceIds.2=8981d45e-b3dc-44c6-b02f-2d1969551318
     */
    @KsYunField(name = "InstanceIds")
    private List<String> InstanceIdsList;

}