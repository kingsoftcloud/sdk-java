package ksyun.client.kpfs.describedirquotalist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDirQuotaListResponse
* @Description DescribeDirQuotaList 返回体
*/
@Data
@ToString
public class DescribeDirQuotaListResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**页码，与请求参数PageNum对应*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**分页大小，与请求参数PageSize对应*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**有设置目录配额的目录总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**目录路径。*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**容量配额的设置方式。参数取值：

none：无设置。仅KPFS性能型支持。

statistics：仅统计。仅KPFS性能型支持。

limit：限制类型。KPFS容量型、标准型、性能型均支持。*/
        @JsonProperty("LogicalCapacityType")
        private String LogicalCapacityType;

        /**容量硬阈值，单位 Byte。*/
        @JsonProperty("LogicalHardThreshold")
        private Long LogicalHardThreshold;

        /**已用容量，单位 Byte。*/
        @JsonProperty("LogicalUsedCapacity")
        private Long LogicalUsedCapacity;

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

}
