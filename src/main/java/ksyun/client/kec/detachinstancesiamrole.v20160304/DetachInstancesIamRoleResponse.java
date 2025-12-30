package ksyun.client.kec.detachinstancesiamrole.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DetachInstancesIamRoleResponse
* @Description DetachInstancesIamRole 返回体
*/
@Data
@ToString
public class DetachInstancesIamRoleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("FailCount")
    private Integer FailCount;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Results")
    private ResultsDto Results;

    @Data
    @ToString
    public static class ResultsDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Result")
        private Boolean Result;

    }

}
