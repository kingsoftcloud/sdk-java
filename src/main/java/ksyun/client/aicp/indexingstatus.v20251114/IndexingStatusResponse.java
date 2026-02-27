package ksyun.client.aicp.indexingstatus.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname IndexingStatusResponse
* @Description IndexingStatus 返回体
*/
@Data
@ToString
public class IndexingStatusResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**批次内各文档进度*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**文档 ID*/
        @JsonProperty("Id")
        private String Id;

        /**索引状态*/
        @JsonProperty("IndexingStatus")
        private String IndexingStatus;

        /**开始处理时间戳*/
        @JsonProperty("ProcessingStartedAt")
        private Long ProcessingStartedAt;

        /**解析完成时间戳*/
        @JsonProperty("ParsingCompletedAt")
        private Long ParsingCompletedAt;

        /**清洗完成时间戳*/
        @JsonProperty("CleaningCompletedAt")
        private Long CleaningCompletedAt;

        /**分片完成时间戳*/
        @JsonProperty("SplittingCompletedAt")
        private Long SplittingCompletedAt;

        /**索引完成时间戳*/
        @JsonProperty("CompletedAt")
        private Long CompletedAt;

        /**暂停时间戳*/
        @JsonProperty("PausedAt")
        private Long PausedAt;

        /**错误信息*/
        @JsonProperty("Error")
        private String Error;

        /**停止时间戳*/
        @JsonProperty("StoppedAt")
        private Long StoppedAt;

        /**已完成分片数*/
        @JsonProperty("CompletedSegments")
        private Integer CompletedSegments;

        /**总分片数*/
        @JsonProperty("TotalSegments")
        private Integer TotalSegments;

    }

}
