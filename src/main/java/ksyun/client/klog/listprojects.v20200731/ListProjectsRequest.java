package ksyun.client.klog.listprojects.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListProjectsRequest
 * @Description 请求参数
 */
@Data
public class ListProjectsRequest {
    /**
     * 返回记录的页码，从0开始
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 每页返回最大条目，默认 500（最大值）
     */
    @KsYunField(name = "Size")
    private Integer Size;


}