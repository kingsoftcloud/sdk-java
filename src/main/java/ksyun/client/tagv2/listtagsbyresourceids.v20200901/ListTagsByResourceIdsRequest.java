package ksyun.client.tagv2.listtagsbyresourceids.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListTagsByResourceIdsRequest
* @Description 请求参数
*/
@Data
public class ListTagsByResourceIdsRequest{
    /**资源类型英文简写，详见 [各产品线资源类型名称](https://docs.ksyun.com/documents/43391)*/
    @KsYunField(name="ResourceType")
    private String ResourceType;

    /**资源ID，多个用逗号连接*/
    @KsYunField(name="ResourceUuids")
    private String ResourceUuids;


}