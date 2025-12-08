package ksyun.client.postgresql.describedblogfiles.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBLogFilesResponse
* @Description DescribeDBLogFiles 返回体
*/
@Data
@ToString
public class DescribeDBLogFilesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**日志文件列表*/
        @JsonProperty("DescribeDBLogFiles")
        private List<DataDtoDescribeDBLogFilesDto> DescribeDBLogFiles;

        @Data
        @ToString
        public static class DataDtoDescribeDBLogFilesDto {
            /**日志下载url
###### 为NULL时，表示PostgreSQL没有提供下载链接URL*/
            @JsonProperty("LogFileName")
            private String LogFileName;

            /**日志大小*/
            @JsonProperty("Size")
            private Integer Size;

            /**行大小*/
            @JsonProperty("RawSize")
            private Integer RawSize;

            /**日志生成时间*/
            @JsonProperty("Date")
            private String Date;

            /**日志开始时间*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**日志开始时间*/
            @JsonProperty("EndTime")
            private String EndTime;

        }

        /**总计数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("Marker")
        private Integer Marker;

        /***/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
