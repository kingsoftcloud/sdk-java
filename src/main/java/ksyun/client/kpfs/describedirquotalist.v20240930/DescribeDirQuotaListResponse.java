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
        /**目录路径*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**容量阈值，单位Byte*/
        @JsonProperty("LogicalHardThreshold")
        private Integer LogicalHardThreshold;

        /**已用容量，单位Byte*/
        @JsonProperty("LogicalUsedCapacity")
        private Integer LogicalUsedCapacity;

    }

}
