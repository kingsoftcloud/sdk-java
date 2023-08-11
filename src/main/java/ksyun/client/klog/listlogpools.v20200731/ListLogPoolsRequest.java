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

    /**页码，从0开始*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页返回最大条目，默认 500（最大值）*/
    @KsYunField(name="Size")
    private Integer Size;

    /**如果想要根据名称搜索某个日志池，该字段必须填写*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;


}