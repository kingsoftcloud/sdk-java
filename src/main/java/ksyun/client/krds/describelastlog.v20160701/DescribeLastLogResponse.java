package ksyun.client.krds.describelastlog.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLastLogResponse
* @Description DescribeLastLog 返回体
*/
@Data
@ToString
public class DescribeLastLogResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**日志文件列表	
*/
        @JsonProperty("LogFiles")
        private List<DataDtoLogFilesDto> LogFiles;

        @Data
        @ToString
        public static class DataDtoLogFilesDto {
            /**下载地址	
*/
            @JsonProperty("LogFileName")
            private String LogFileName;

            /**日志大小，单位Byte	
*/
            @JsonProperty("Size")
            private String Size;

            /**日志类型
	请求类型与返回类型对照关系：SlowLog("slowquery"), ErrorLog("errlog"), Binlog("binlog")*/
            @JsonProperty("DBLogType")
            private String DBLogType;

            /**预计等待上传时间
*/
            @JsonProperty("WaitSeconds")
            private Integer WaitSeconds;

            /**上传状态
Uploading：上传中；Finished：上传成功*/
            @JsonProperty("Status")
            private String Status;

        }

    }

    /**请求id	
*/
    @JsonProperty("RequestId")
    private String RequestId;

}
