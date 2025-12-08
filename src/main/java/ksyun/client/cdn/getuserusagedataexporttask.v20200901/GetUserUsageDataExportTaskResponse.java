package ksyun.client.cdn.getuserusagedataexporttask.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUserUsageDataExportTaskResponse
* @Description GetUserUsageDataExportTask 返回体
*/
@Data
@ToString
public class GetUserUsageDataExportTaskResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("UsageDataPerPage")
    private UsageDataPerPageDto UsageDataPerPage;

    @Data
    @ToString
    public static class UsageDataPerPageDto {
        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("PageNumber")
        private Integer PageNumber;

        /***/
        @JsonProperty("DataItem")
        private List<UsageDataPerPageDtoDataItemDto> DataItem;

        @Data
        @ToString
        public static class UsageDataPerPageDtoDataItemDto {
            /***/
            @JsonProperty("TaskId")
            private String TaskId;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("TaskConfig")
            private UsageDataPerPageDtoDataItemDtoTaskConfigDto TaskConfig;

            @Data
            @ToString
            public static class UsageDataPerPageDtoDataItemDtoTaskConfigDto {
                /***/
                @JsonProperty("StartTime")
                private String StartTime;

                /***/
                @JsonProperty("EndTime")
                private String EndTime;

            }

            /***/
            @JsonProperty("DownloadUrl")
            private String DownloadUrl;

        }

    }

}
