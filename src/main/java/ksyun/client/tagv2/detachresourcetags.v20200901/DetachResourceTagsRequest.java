package ksyun.client.tagv2.detachresourcetags.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DetachResourceTagsRequest
 * @Description 请求参数
 */
@Data
public class DetachResourceTagsRequest {
    /**
     * 资源类型英文简写
     */
    @KsYunField(name = "ResourceType")
    private String ResourceType;

    /**
     * 资源ID
     */
    @KsYunField(name = "ResourceUuid")
    private String ResourceUuid;

    /**
     * 标签值ID，多个用逗号连接
     */
    @KsYunField(name = "TagIds")
    private String TagIds;

}