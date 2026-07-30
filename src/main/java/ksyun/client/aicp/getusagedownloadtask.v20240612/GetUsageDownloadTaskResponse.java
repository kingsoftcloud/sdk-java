package ksyun.client.aicp.getusagedownloadtask.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetUsageDownloadTaskResponse
* @Description GetUsageDownloadTask 返回体
*/
@Data
@ToString
public class GetUsageDownloadTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("File")
    private FileDto File;

    @Data
    @ToString
    public static class FileDto {
        /**下载地址，有效期为24小时*/
        @JsonProperty("DownloadUrl")
        private String DownloadUrl;

        /**文件在对象存储上的保留到期时间，UTC Unix 秒。过期后文件被清理，需重新创建任务*/
        @JsonProperty("FileExpireTimestamp")
        private Long FileExpireTimestamp;

    }

}
