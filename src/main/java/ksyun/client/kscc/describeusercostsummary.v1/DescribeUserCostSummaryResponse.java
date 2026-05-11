package ksyun.client.kscc.describeusercostsummary.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeUserCostSummaryResponse
* @Description DescribeUserCostSummary 返回体
*/
@Data
@ToString
public class DescribeUserCostSummaryResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户配额汇总*/
    @JsonProperty("DescribeUserCostSummaryResult")
    private DescribeUserCostSummaryResultDto DescribeUserCostSummaryResult;

    @Data
    @ToString
    public static class DescribeUserCostSummaryResultDto {
        /**用户中文名*/
        @JsonProperty("UserCnName")
        private String UserCnName;

        /**用户邮箱前缀*/
        @JsonProperty("UserName")
        private String UserName;

        /**部门ID*/
        @JsonProperty("DeptId")
        private String DeptId;

        /**部门名称或完整路径*/
        @JsonProperty("DeptName")
        private String DeptName;

        /**统计月份*/
        @JsonProperty("Month")
        private String Month;

        /**月度配额限制*/
        @JsonProperty("QuotaAmount")
        private Double QuotaAmount;

        /**配额来源：account账号配额、dept部门配额、member用户单独配额、memberDefault默认成员配额*/
        @JsonProperty("QuotaLimitBy")
        private String QuotaLimitBy;

        /**本月已使用金额*/
        @JsonProperty("UsageAmount")
        private Double UsageAmount;

        /**使用比例，UsageAmount/QuotaAmount*/
        @JsonProperty("UsagePercent")
        private Double UsagePercent;

    }

}
