package ksyun.client.tagv2.deletetag.v20200901;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DeleteTagRequest
 * @Description 请求参数
 */
@Data
public class DeleteTagRequest {
    /**
     * Tags
     */
    @KsYunField(name = "Tags", type = 2)
    private List<TagsDto> TagsList;

    @Data
    @ToString
    public static class TagsDto {
        /**
         * 标签key
         */
        private String Key;
        /**
         * 标签Value
         */
        private String Value;
    }


}