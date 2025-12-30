package ksyun.client.krds.describedblogfiles.v20160701;

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

    /**下次开始获取记录的开始偏移量
*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**日志文件列表
*/
        @JsonProperty("DescribeDBLogFiles")
        private List<DataDescribeDBLogFilesDto> DescribeDBLogFiles;

        @Data
        @ToString
        public static class DataDescribeDBLogFilesDto {
            /**日志下载url，为NULL时，表示RDS没有提供下载链接URL	
*/
            @JsonProperty("LogFileName")
            private String LogFileName;

            /**日志大小,单位KB
*/
            @JsonProperty("Size")
            private Double Size;

            /**行大小	
*/
            @JsonProperty("RawSize")
            private Double RawSize;

            /**日志生成时间	
*/
            @JsonProperty("Date")
            private String Date;

            /**日志开始时间
*/
            @JsonProperty("StartTime")
            private String StartTime;

            /**日志结束时间	
*/
            @JsonProperty("EndTime")
            private String EndTime;

        }

        /**	当前类型日志总条数	
*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /**下次开始获取记录的开始偏移量
*/
        @JsonProperty("Marker")
        private Integer Marker;

        /**每页结果中包含的最大条数	
*/
        @JsonProperty("MaxRecords")
        private Integer MaxRecords;

    }

    /**请求id	
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
