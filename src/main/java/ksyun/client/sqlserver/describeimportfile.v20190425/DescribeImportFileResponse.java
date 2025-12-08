package ksyun.client.sqlserver.describeimportfile.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImportFileResponse
* @Description DescribeImportFile 返回体
*/
@Data
@ToString
public class DescribeImportFileResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**导入文件详情*/
        @JsonProperty("ImportFile")
        private List<ImportFileDto> ImportFile;

        @Data
        @ToString
        public static class ImportFileDto {
            /**导入文件名称*/
            @JsonProperty("ImportFileName")
            private String ImportFileName;

            /**导入文件大小。默认单位：B*/
            @JsonProperty("ImportFileSize")
            private Integer ImportFileSize;

            /**开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**结束时间*/
            @JsonProperty("EndTime")
            private String EndTime;

            /**备份类型  FULL 全量*/
            @JsonProperty("ImportFileType")
            private String ImportFileType;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
