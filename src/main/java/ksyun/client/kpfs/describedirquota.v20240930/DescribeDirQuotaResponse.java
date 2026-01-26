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

}
