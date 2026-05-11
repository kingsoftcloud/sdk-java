package ksyun.client.kscc.describeusertokenusage.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeUserTokenUsageResponse
* @Description DescribeUserTokenUsage 返回体
*/
@Data
@ToString
public class DescribeUserTokenUsageResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户Token用量结果*/
    @JsonProperty("DescribeUserTokenUsageResult")
    private DescribeUserTokenUsageResultDto DescribeUserTokenUsageResult;

    @Data
    @ToString
    public static class DescribeUserTokenUsageResultDto {
        /**返回记录数*/
        @JsonProperty("Total")
        private Integer Total;

        /**用户用量列表*/
        @JsonProperty("Items")
        private List<DescribeUserTokenUsageResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeUserTokenUsageResultItemsDto {
            /**用户邮箱前缀*/
            @JsonProperty("UserName")
            private String UserName;

            /**统计日期*/
            @JsonProperty("StatDate")
            private String StatDate;

            /**总Token数*/
            @JsonProperty("TotalTokens")
            private Integer TotalTokens;

            /**输入Token数*/
            @JsonProperty("InputTokens")
            private Integer InputTokens;

            /**输出Token数*/
            @JsonProperty("OutputTokens")
            private Integer OutputTokens;

            /**缓存命中Token数*/
            @JsonProperty("CachedTokens")
            private Integer CachedTokens;

            /**折后配额消耗金额*/
            @JsonProperty("QuotaAmount")
            private Double QuotaAmount;

            /**用户所在部门完整路径*/
            @JsonProperty("AbsPath")
            private String AbsPath;

        }

    }

}
