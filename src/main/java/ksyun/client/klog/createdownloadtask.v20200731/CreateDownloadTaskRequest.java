package ksyun.client.klog.createdownloadtask.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDownloadTaskRequest
* @Description 请求参数
*/
@Data
public class CreateDownloadTaskRequest{
    /**日志起始时间*/
    @KsYunField(name="From")
    private String From;

    /**日志截止时间，时间跨度不能超过24小时*/
    @KsYunField(name="To")
    private String To;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;


}