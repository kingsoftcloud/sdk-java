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
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolNames")
    private String LogPoolNames;

    /**下载参数*/
    @KsYunField(name="Config")

    private ConfigDto ConfigList;

    @Data
    @ToString
    public static class ConfigDto {
        /**日志开始时间*/
        @KsYunField(name="From")
        private Integer From;
        /**日志结束时间*/
        @KsYunField(name="To")
        private Integer To;
        /**日志下载语句*/
        @KsYunField(name="Query")
        private String Query;
        /**下载格式*/
        @KsYunField(name="Format")
        private String Format;
        /**日志排序*/
        @KsYunField(name="Order")
        private String Order;
        /**下载日志条数*/
        @KsYunField(name="Count")
        private Integer Count;
    }
}