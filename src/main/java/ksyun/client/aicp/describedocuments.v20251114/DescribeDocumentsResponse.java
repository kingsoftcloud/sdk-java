package ksyun.client.aicp.describedocuments.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDocumentsResponse
* @Description DescribeDocuments 返回体
*/
@Data
@ToString
public class DescribeDocumentsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**文档列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**文档 ID*/
        @JsonProperty("Id")
        private String Id;

        /**文档名称*/
        @JsonProperty("Name")
        private String Name;

        /**创建时间戳*/
        @JsonProperty("CreatedAt")
        private Long CreatedAt;

        /**展示状态：queuing / indexing / available / error*/
        @JsonProperty("DisplayStatus")
        private String DisplayStatus;

        /**错误描述（如有）*/
        @JsonProperty("Error")
        private String Error;

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
