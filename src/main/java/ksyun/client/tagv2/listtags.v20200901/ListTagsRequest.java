package ksyun.client.tagv2.listtags.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListTagsRequest
* @Description 请求参数
*/
@Data
public class ListTagsRequest{
    /**Page*/
    @KsYunField(name="Page")
    private Integer Page;

    /**PageSize*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**key*/
    @KsYunField(name="Key")
    private String Key;

    /**Value*/
    @KsYunField(name="Value")
    private String Value;

}
