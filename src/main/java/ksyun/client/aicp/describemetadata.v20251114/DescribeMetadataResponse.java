package ksyun.client.aicp.describemetadata.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMetadataResponse
* @Description DescribeMetadata 返回体
*/
@Data
@ToString
public class DescribeMetadataResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**元数据列表*/
    @JsonProperty("DocMetadata")
    private List<DocMetadataDto> DocMetadata;

    @Data
    @ToString
    public static class DocMetadataDto {
        /**元数据ID*/
        @JsonProperty("Id")
        private String Id;

        /**元数据名称*/
        @JsonProperty("Name")
        private String Name;

        /**元数据类型
枚举值：string  number  time  array[number]  array[string]*/
        @JsonProperty("Type")
        private String Type;

        /**绑定文档数*/
        @JsonProperty("Count")
        private Integer Count;

    }

}
