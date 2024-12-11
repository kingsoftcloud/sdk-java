package ksyun.client.kmr.bindtags.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BindTagsRequest
* @Description 请求参数
*/
@Data
public class BindTagsRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**标签列表*/
    @KsYunField(name="Tags",type=2)
    private List<TagsDto> TagsList;

    @Data
    @ToString
    public static class TagsDto {
        /**标签键*/
        private String TagKey;
        /**标签值*/
        private String TagValue;
        /**标签键ID*/
        private Integer TagId;
    }


}