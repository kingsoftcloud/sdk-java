package ksyun.client.tagv2.listtagsbyresourceids.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListTagsByResourceIdsResponse
* @Description ListTagsByResourceIds 返回体
*/
@Data
@ToString
public class ListTagsByResourceIdsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Tags")
    private List<TagsDto> Tags;

    @Data
    @ToString
    public static class TagsDto {
        /**资源id*/
        @JsonProperty("ResourceUuid")
        private String ResourceUuid;

        /**标签值ID*/
        @JsonProperty("TagId")
        private Integer TagId;

        /**标签键*/
        @JsonProperty("TagKey")
        private String TagKey;

        /**标签值*/
        @JsonProperty("TagValue")
        private String TagValue;

    }

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
