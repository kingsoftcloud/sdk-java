package ksyun.client.kscc.describeshareduserpointusage.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSharedUserPointUsageResponse
* @Description DescribeSharedUserPointUsage 返回体
*/
@Data
@ToString
public class DescribeSharedUserPointUsageResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户积分用量结果*/
    @JsonProperty("DescribeUserTokenUsageResult")
    private DescribeUserTokenUsageResultDto DescribeUserTokenUsageResult;

    @Data
    @ToString
    public static class DescribeUserTokenUsageResultDto {
        /**返回记录数*/
        @JsonProperty("Total")
        private Integer Total;

        /**用户积分用量列表*/
        @JsonProperty("Items")
        private List<DescribeUserTokenUsageResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeUserTokenUsageResultItemsDto {
            /**用户名*/
            @JsonProperty("UserName")
            private String UserName;

            /**统计日期，格式：yyyy-MM-dd*/
            @JsonProperty("StatDate")
            private String StatDate;

            /**消耗积分*/
            @JsonProperty("pointCost")
            private Double PointCost;

            /**个人积分消耗*/
            @JsonProperty("selfPointCost")
            private Double SelfPointCost;

            /**共享积分消耗*/
            @JsonProperty("sharedPointCost")
            private Double SharedPointCost;

            /**增量包积分消耗*/
            @JsonProperty("creditPackagePointCost")
            private Double CreditPackagePointCost;

            /**用户所在部门完整路径*/
            @JsonProperty("AbsPath")
            private String AbsPath;

        }

    }

}
