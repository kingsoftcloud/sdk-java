package ksyun.client.klog.listlogpools.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListLogPoolsRequest
* @Description 请求参数
*/
@Data
public class ListLogPoolsRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**根据日志池名称筛选日志池，支持模糊搜索*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**页码，从0开始*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页返回最大条目，最大值500*/
    @KsYunField(name="Size")
    private Integer Size;

    /**需要筛选的标签*/
    @KsYunField(name="Tags")

    private TagsDto TagsList;

    @Data
    @ToString
    public static class TagsDto {
        /**标签键*/
        @KsYunField(name="Key")
        private String Key;
        /**标签值*/
        @KsYunField(name="Value")
        private String Value;
    }
}