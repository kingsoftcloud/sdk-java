package ksyun.client.krds.batchapplydbparametergroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchApplyDBParameterGroupResponse
* @Description BatchApplyDBParameterGroup 返回体
*/
@Data
@ToString
public class BatchApplyDBParameterGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("succeededCount")
    private Integer SucceededCount;

    /***/
    @JsonProperty("failedCount")
    private Integer FailedCount;

    /***/
    @JsonProperty("succeeded")
    private List<String> Succeeded;

    /***/
    @JsonProperty("failed")
    private List<FailedDto> Failed;

    @Data
    @ToString
    public static class FailedDto {
        /***/
        @JsonProperty("result")
        private String Result;

        /***/
        @JsonProperty("id")
        private String Id;

        /***/
        @JsonProperty("name")
        private String Name;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
