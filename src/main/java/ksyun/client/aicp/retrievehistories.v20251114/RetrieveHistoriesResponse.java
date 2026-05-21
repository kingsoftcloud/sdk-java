package ksyun.client.aicp.retrievehistories.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RetrieveHistoriesResponse
* @Description RetrieveHistories 返回体
*/
@Data
@ToString
public class RetrieveHistoriesResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**检索历史列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**查询ID*/
        @JsonProperty("Id")
        private String Id;

        /**查询内容*/
        @JsonProperty("Content")
        private String Content;

        /**创建时间戳*/
        @JsonProperty("CreatedAt")
        private Long CreatedAt;

    }

    /**是否还有更多*/
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
