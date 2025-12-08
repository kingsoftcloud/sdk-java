package ksyun.client.ebs.creatededicatedblockstoragecluster.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDedicatedBlockStorageClusterRequest
* @Description 请求参数
*/
@Data
public class CreateDedicatedBlockStorageClusterRequest{
    /**集群名称,2到50个字符*/
    @KsYunField(name="DbscName")
    private String DbscName;

    /**集群类型，DBSC_Standard|DBSC_Premium*/
    @KsYunField(name="DbscType")
    private String DbscType;

    /**集群大小*/
    @KsYunField(name="Size")
    private Integer Size;

    /**集群可用区*/
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**购买月份*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

}
