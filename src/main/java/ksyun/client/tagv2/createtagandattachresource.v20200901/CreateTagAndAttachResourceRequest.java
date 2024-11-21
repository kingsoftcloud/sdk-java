package ksyun.client.tagv2.createtagandattachresource.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateTagAndAttachResourceRequest
* @Description 请求参数
*/
@Data
public class CreateTagAndAttachResourceRequest{
    /**TagKey*/
    @KsYunField(name="TagKey")
    private String TagKey;

    /**TagValue*/
    @KsYunField(name="TagValue")
    private String TagValue;

    /**资源类型，[各产品线资源类型](https://docs.ksyun.com/documents/43391)*/
    @KsYunField(name="ResourceType")
    private String ResourceType;

    /**ResourceUuid*/
    @KsYunField(name="ResourceUuid")
    private String ResourceUuid;


}