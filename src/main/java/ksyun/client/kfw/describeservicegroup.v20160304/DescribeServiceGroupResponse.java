package ksyun.client.kfw.describeservicegroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeServiceGroupResponse
* @Description DescribeServiceGroup 返回体
*/
@Data
@ToString
public class DescribeServiceGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CfwServiceGroups")
    private List<CfwServiceGroupsDto> CfwServiceGroups;

    @Data
    @ToString
    public static class CfwServiceGroupsDto {
        /***/
        @JsonProperty("ServiceGroupId")
        private String ServiceGroupId;

        /***/
        @JsonProperty("ServiceGroupName")
        private String ServiceGroupName;

        /***/
        @JsonProperty("ServiceInfo")
        private List<String> ServiceInfo;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("CitationCount")
        private Integer CitationCount;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
