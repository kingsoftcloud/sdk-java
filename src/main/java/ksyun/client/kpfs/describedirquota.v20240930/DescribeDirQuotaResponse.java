package ksyun.client.kpfs.describedirquota.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDirQuotaResponse
* @Description DescribeDirQuota 返回体
*/
@Data
@ToString
public class DescribeDirQuotaResponse extends BaseResponseModel {

    /**唯一请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**容量硬阈值，单位Byte*/
    @JsonProperty("LogicalHardThreshold")
    private Long LogicalHardThreshold;

    /**已用容量，单位Byte*/
    @JsonProperty("LogicalUsedCapacity")
    private Long LogicalUsedCapacity;

    /**容量配额的设置方式。参数取值：

none：无设置。仅KPFS性能型支持。

statistics：仅统计。仅KPFS性能型支持。

limit：限制类型。KPFS容量型、标准型、性能型均支持。*/
    @JsonProperty("LogicalCapacityType")
    private String LogicalCapacityType;

    /**Inodes配额的设置方式，仅KPFS性能型支持。参数取值：

none：无设置

statistics：仅统计

limit：限制类型。*/
    @JsonProperty("LogicalInodesType")
    private String LogicalInodesType;

    /**Inodes硬阈值，仅KPFS性能型支持。单位个。*/
    @JsonProperty("LogicalHardInodes")
    private Long LogicalHardInodes;

    /**已用Inodes，仅KPFS性能型支持。单位个。*/
    @JsonProperty("LogicalUsedInodes")
    private Long LogicalUsedInodes;

}
