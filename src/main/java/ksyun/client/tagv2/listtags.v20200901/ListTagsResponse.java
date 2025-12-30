package ksyun.client.tagv2.listtags.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListTagsResponse
* @Description ListTags 返回体
*/
@Data
@ToString
public class ListTagsResponse extends BaseResponseModel {

    /**Tags*/
    @JsonProperty("Tags")
    private List<TagsDto> Tags;

    @Data
    @ToString
    public static class TagsDto {
        /**标签值的ID标识*/
        @JsonProperty("Id")
        private Integer Id;

        /**标签键*/
        @JsonProperty("Key")
        private String Key;

        /**标签值*/
        @JsonProperty("Value")
        private String Value;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**能否删除 
- 0不能删除  
- 1能删除

如果绑定了资源，标签值不能删除。*/
        @JsonProperty("CanDelete")
        private Integer CanDelete;

        /**是否作为分账标签
0否
1是*/
        @JsonProperty("IsBillTag")
        private Integer IsBillTag;

    }

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**当页条数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
