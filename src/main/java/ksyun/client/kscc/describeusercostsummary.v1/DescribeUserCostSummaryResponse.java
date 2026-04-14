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

    /***/
    @JsonProperty("DescribeUserCostSummaryResult")
    private DescribeUserCostSummaryResultDto DescribeUserCostSummaryResult;

    @Data
    @ToString
    public static class DescribeUserCostSummaryResultDto {
        /**中文名称*/
        @JsonProperty("UserCnName")
        private String UserCnName;

        /**邮箱前缀*/
        @JsonProperty("UserName")
        private String UserName;

        /**部门ID，例如：取自WPS生成的部门ID*/
        @JsonProperty("DeptId")
        private String DeptId;

        /**部门中文名称*/
        @JsonProperty("DeptName")
        private String DeptName;

        /**月份，格式为YYYY-MM*/
        @JsonProperty("Month")
        private String Month;

        /**配额月度限制*/
        @JsonProperty("QuotaAmount")
        private Integer QuotaAmount;

        /**本金已使用*/
        @JsonProperty("UsageAmount")
        private Double UsageAmount;

        /**使用百分比，UsageAmount/QuotaAmount的比例*/
        @JsonProperty("UsagePercent")
        private Integer UsagePercent;

    }

}
