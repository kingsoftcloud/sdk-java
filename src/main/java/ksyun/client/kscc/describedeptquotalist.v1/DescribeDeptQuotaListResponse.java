package ksyun.client.kscc.describedeptquotalist.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDeptQuotaListResponse
* @Description DescribeDeptQuotaList 返回体
*/
@Data
@ToString
public class DescribeDeptQuotaListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**部门配额列表结果*/
    @JsonProperty("DescribeDeptQuotaListResult")
    private DescribeDeptQuotaListResultDto DescribeDeptQuotaListResult;

    @Data
    @ToString
    public static class DescribeDeptQuotaListResultDto {
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
        private List<DescribeDeptQuotaListResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeDeptQuotaListResultItemsDto {
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
