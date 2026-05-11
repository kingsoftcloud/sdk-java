package ksyun.client.kscc.describeaccountquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAccountQuotaResponse
* @Description DescribeAccountQuota 返回体
*/
@Data
@ToString
public class DescribeAccountQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**账号配额结果*/
    @JsonProperty("DescribeAccountQuotaResult")
    private DescribeAccountQuotaResultDto DescribeAccountQuotaResult;

    @Data
    @ToString
    public static class DescribeAccountQuotaResultDto {
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
