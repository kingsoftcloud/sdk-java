package ksyun.client.tagv2.listtagkeys.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListTagKeysRequest
* @Description 请求参数
*/
@Data
public class ListTagKeysRequest{
    /**标签键名称*/
    @KsYunField(name="TagKey")
    private String TagKey;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页数据量*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
