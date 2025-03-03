package ksyun.client.tagv2.listtagvalues.v20200901;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListTagValuesRequest
 * @Description 请求参数
 */
@Data
public class ListTagValuesRequest {
    /**
     * 标签键名称，多个用逗号连接
     */
    @KsYunField(name = "TagKeys")
    private String TagKeys;

    /**
     * 页码
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 页面限制
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;


}