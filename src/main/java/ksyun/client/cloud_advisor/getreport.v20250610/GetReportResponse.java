package ksyun.client.cloud_advisor.getreport.v20250610;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetReportResponse
* @Description GetReport 返回体
*/
@Data
@ToString
public class GetReportResponse extends BaseResponseModel {

    /***/
    @JsonProperty("msg")
    private String Msg;

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("taskId")
        private String TaskId;

        /***/
        @JsonProperty("filePdfUrl")
        private String FilePdfUrl;

        /***/
        @JsonProperty("fileExcelUrl")
        private String FileExcelUrl;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("status")
        private Integer Status;

        /***/
        @JsonProperty("statusName")
        private String StatusName;

    }

}
