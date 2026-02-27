package ksyun.client.aicp.describeknowledgebases.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKnowledgeBasesResponse
* @Description DescribeKnowledgeBases 返回体
*/
@Data
@ToString
public class DescribeKnowledgeBasesResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**知识库列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**知识库 ID*/
        @JsonProperty("Id")
        private String Id;

        /**知识库名称*/
        @JsonProperty("Name")
        private String Name;

        /**文档数*/
        @JsonProperty("DocumentCount")
        private Integer DocumentCount;

        /**总词数*/
        @JsonProperty("WordCount")
        private Integer WordCount;

        /**创建时间戳*/
        @JsonProperty("CreatedAt")
        private Long CreatedAt;

        /**更新时间戳*/
        @JsonProperty("UpdatedAt")
        private Long UpdatedAt;

    }

    /**是否还有下一页*/
    @JsonProperty("HasMore")
    private Boolean HasMore;

    /**总条数*/
    @JsonProperty("Total")
    private Integer Total;

    /**当前页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**每页条数*/
    @JsonProperty("Limit")
    private Integer Limit;

}
