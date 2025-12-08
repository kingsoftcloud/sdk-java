package ksyun.client.iam.updateinstanceprojectid.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateInstanceProjectIdResponse
* @Description UpdateInstanceProjectId 返回体
*/
@Data
@ToString
public class UpdateInstanceProjectIdResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
