package ksyun.client.kec.creatededicatedhosts.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDedicatedHostsRequest
* @Description 请求参数
*/
@Data
public class CreateDedicatedHostsRequest{
    /**物理机类型*/
    @KsYunField(name="DedicatedType")
    private String DedicatedType;

    /**购买数量*/
    @KsYunField(name="Number")
    private Integer Number;

    /**物理机名称（如果未指定，则自动生成）*/
    @KsYunField(name="Name")
    private String Name;

    /**购买方式*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**物理机名称后缀（购买多台物理机时使用）*/
    @KsYunField(name="InstanceNameSuffix")
    private String InstanceNameSuffix;

    /***/
    @KsYunField(name="DedicatedClusterId")
    private String DedicatedClusterId;

    /**创建的专属宿主机的标签键，N取值范围1~10。若填写了Tag.N.Value，Tag.N.Key为必填，且两个参数的N值需保持一致*/
    @KsYunField(name="Tag")
    private List<TagDto> TagList;

    @Data
    @ToString
    public static class TagDto {
        /**创建的专属宿主机的标签键，N取值范围1~10。若填写了Tag.N.Value，Tag.N.Key为必填，且两个参数的N值需保持一致*/
        @KsYunField(name="Key")
        private String Key;
        /**创建的专属宿主机的标签值，N取值范围1~10*/
        @KsYunField(name="Value")
        private String Value;
    }


}