package ksyun.client.kscc.describeuserquotalist.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeUserQuotaListResponse
* @Description DescribeUserQuotaList 返回体
*/
@Data
@ToString
public class DescribeUserQuotaListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户配额列表结果*/
    @JsonProperty("DescribeUserQuotaListResult")
    private DescribeUserQuotaListResultDto DescribeUserQuotaListResult;

    @Data
    @ToString
    public static class DescribeUserQuotaListResultDto {
        /**总记录数*/
        @JsonProperty("Total")
        private Integer Total;

        /**当前页码*/
        @JsonProperty("PageNum")
        private Integer PageNum;

        /**每页条数*/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /**列表数据*/
        @JsonProperty("Items")
        private List<DescribeUserQuotaListResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeUserQuotaListResultItemsDto {
            /**用户邮箱前缀*/
            @JsonProperty("UserName")
            private String UserName;

            /**用户中文名*/
            @JsonProperty("UserCnName")
            private String UserCnName;

            /**部门ID*/
            @JsonProperty("DeptId")
            private String DeptId;

            /**部门名称*/
            @JsonProperty("DeptName")
            private String DeptName;

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

}
