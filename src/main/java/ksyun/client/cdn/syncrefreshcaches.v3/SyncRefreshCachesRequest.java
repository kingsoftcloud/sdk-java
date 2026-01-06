package ksyun.client.cdn.syncrefreshcaches.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SyncRefreshCachesRequest
* @Description 请求参数
*/
@Data
public class SyncRefreshCachesRequest{
    /**需要文件类型刷新的Url列表*/
    @KsYunField(name="Files",type=2)
    private List<FilesDto> FilesList;

    @Data
    @ToString
    public static class FilesDto {
        /**需要提交刷新的Url，单条输入*/
        @KsYunField(name="Url")
        private String Url;

    }

    /**需要目录类型刷新的Url列表*/
    @KsYunField(name="Dirs",type=2)
    private List<DirsDto> DirsList;

    @Data
    @ToString
    public static class DirsDto {
        /**需要提交刷新的Url，单条输入*/
        @KsYunField(name="Url")
        private String Url;

    }

}
