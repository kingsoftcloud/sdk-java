package ksyun.client.klog.listdownloadtasks.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListDownloadTasksRequest
* @Description 请求参数
*/
@Data
public class ListDownloadTasksRequest{
    /**页码*/
    @KsYunField(name="Page")
    private String Page;

    /**每页大小*/
    @KsYunField(name="Size")
    private String Size;

    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;


}