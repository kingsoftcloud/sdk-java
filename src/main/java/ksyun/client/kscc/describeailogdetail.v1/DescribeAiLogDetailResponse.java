package ksyun.client.kscc.describeailogdetail.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAiLogDetailResponse
* @Description DescribeAiLogDetail 返回体
*/
@Data
@ToString
public class DescribeAiLogDetailResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**日志分页结果*/
    @JsonProperty("DescribeAiLogDetailResult")
    private DescribeAiLogDetailResultDto DescribeAiLogDetailResult;

    @Data
    @ToString
    public static class DescribeAiLogDetailResultDto {
        /**总条数*/
        @JsonProperty("Total")
        private Integer Total;

        /**当前页码*/
        @JsonProperty("Page")
        private Integer Page;

        /**每页条数*/
        @JsonProperty("Size")
        private Integer Size;

        /**总页数*/
        @JsonProperty("TotalPages")
        private Integer TotalPages;

        /**日志列表*/
        @JsonProperty("Items")
        private List<DescribeAiLogDetailResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeAiLogDetailResultItemsDto {
            /**日志ID*/
            @JsonProperty("MessageId")
            private String MessageId;

            /**创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**用户邮箱前缀*/
            @JsonProperty("UserName")
            private String UserName;

            /**模型名称*/
            @JsonProperty("Model")
            private String Model;

            /**总Token数*/
            @JsonProperty("Tokens")
            private Integer Tokens;

            /**折后配额消耗金额*/
            @JsonProperty("QuotaAmount")
            private Double QuotaAmount;

            /**日志状态码，200表示成功*/
            @JsonProperty("StatusCode")
            private Integer StatusCode;

            /**日志状态*/
            @JsonProperty("Status")
            private String Status;

        }

    }

}
