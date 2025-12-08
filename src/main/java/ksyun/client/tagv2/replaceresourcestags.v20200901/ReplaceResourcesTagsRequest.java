package ksyun.client.tagv2.replaceresourcestags.v20200901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReplaceResourcesTagsRequest
* @Description 请求参数
*/
@Data
public class ReplaceResourcesTagsRequest{
    /**资源类型英文简写*/
    @KsYunField(name="ResourceType")
    private String ResourceType;

    /***/
    @KsYunField(name="ReplaceTags",type=2)
    private List<ReplaceTagsDto1> ReplaceTagsList;

    @Data
    @ToString
    public static class ReplaceTagsDto1 {
        /**	
资源ID，多个用逗号分隔*/
        @KsYunField(name="ResourceUuids")
        private String ResourceUuids;

        /***/
        @KsYunField(name="TagIds")
        private String TagIds;

    }

}
