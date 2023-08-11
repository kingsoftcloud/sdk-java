package ksyun.client.klog.getdownloadurls.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDownloadUrlsRequest
* @Description 请求参数
*/
@Data
public class GetDownloadUrlsRequest{
    /**任务下载ID，通过获取下载任务列表获取*/
    @KsYunField(name="DownloadID")
    private String DownloadID;

    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;


}