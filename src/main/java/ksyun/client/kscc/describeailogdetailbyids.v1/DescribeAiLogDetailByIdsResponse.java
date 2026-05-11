package ksyun.client.kscc.describeailogdetailbyids.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAiLogDetailByIdsResponse
* @Description DescribeAiLogDetailByIds 返回体
*/
@Data
@ToString
public class DescribeAiLogDetailByIdsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**日志详情列表*/
    @JsonProperty("DescribeAiLogDetailByIdsResult")
    private DescribeAiLogDetailByIdsResultDto DescribeAiLogDetailByIdsResult;

    @Data
    @ToString
    public static class DescribeAiLogDetailByIdsResultDto {
        /**消息总数*/
        @JsonProperty("Total")
        private Integer Total;

        /**消息详情列表*/
        @JsonProperty("Items")
        private List<DescribeAiLogDetailByIdsResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeAiLogDetailByIdsResultItemsDto {
            /**消息ID*/
            @JsonProperty("MessageId")
            private String MessageId;

            /**请求状态*/
            @JsonProperty("Status")
            private String Status;

            /**请求状态码，200表示成功*/
            @JsonProperty("StatusCode")
            private Integer StatusCode;

            /**向模型发送的请求体*/
            @JsonProperty("RequestJson")
            private String RequestJson;

            /**模型响应结果*/
            @JsonProperty("ResponseJson")
            private String ResponseJson;

        }

    }

}
