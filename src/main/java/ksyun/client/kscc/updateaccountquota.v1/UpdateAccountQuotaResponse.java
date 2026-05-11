package ksyun.client.kscc.updateaccountquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateAccountQuotaResponse
* @Description UpdateAccountQuota 返回体
*/
@Data
@ToString
public class UpdateAccountQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**更新后的账号配额*/
    @JsonProperty("UpdateAccountQuotaResult")
    private UpdateAccountQuotaResultDto UpdateAccountQuotaResult;

    @Data
    @ToString
    public static class UpdateAccountQuotaResultDto {
        /**月度配额限制*/
        @JsonProperty("QuotaAmount")
        private Double QuotaAmount;

        /**本月已使用金额*/
        @JsonProperty("UsageAmount")
        private Double UsageAmount;

        /**使用比例，UsageAmount/QuotaAmount*/
        @JsonProperty("UsagePercent")
        private Double UsagePercent;

    }

}
