package ksyun.client.klog.listprojects.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListProjectsRequest
* @Description 请求参数
*/
@Data
public class ListProjectsRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**工程描述*/
    @KsYunField(name="Description")
    private String Description;

    /**返回记录的页码，从0开始*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页返回最大条目，最大值500*/
    @KsYunField(name="Size")
    private Integer Size;

}
