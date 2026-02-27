package ksyun.client.aicp.batchdisplaystatus.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchDisplayStatusResponse
* @Description BatchDisplayStatus 返回体
*/
@Data
@ToString
public class BatchDisplayStatusResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**整体状态*/
    @JsonProperty("Status")
    private String Status;

    /**各文档状态*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**文档 ID*/
        @JsonProperty("Id")
        private String Id;

        /**展示状态*/
        @JsonProperty("DisplayStatus")
        private String DisplayStatus;

    }

    /**异常文档*/
    @JsonProperty("Errors")
    private List<ErrorsDto> Errors;

    @Data
    @ToString
    public static class ErrorsDto {
        /**文档 ID*/
        @JsonProperty("Id")
        private String Id;

        /**错误描述*/
        @JsonProperty("Error")
        private String Error;

    }

}
