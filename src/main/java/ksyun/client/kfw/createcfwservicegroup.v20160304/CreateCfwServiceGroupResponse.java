package ksyun.client.kfw.createcfwservicegroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCfwServiceGroupResponse
* @Description CreateCfwServiceGroup 返回体
*/
@Data
@ToString
public class CreateCfwServiceGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CfwServiceGroup")
    private CfwServiceGroupDto CfwServiceGroup;

    @Data
    @ToString
    public static class CfwServiceGroupDto {
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

}
