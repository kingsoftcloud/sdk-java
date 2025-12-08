package ksyun.client.mongodb.describeparamgrouplist.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeParamGroupListResponse
* @Description DescribeParamGroupList 返回体
*/
@Data
@ToString
public class DescribeParamGroupListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("ParamGroupList")
    private List<ParamGroupListDto> ParamGroupList;

    @Data
    @ToString
    public static class ParamGroupListDto {
        /***/
        @JsonProperty("DbVersion")
        private String DbVersion;

        /***/
        @JsonProperty("ParamGroupName")
        private String ParamGroupName;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("ParamGroupId")
        private String ParamGroupId;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

}
