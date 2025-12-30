package ksyun.client.iam.updateprojectinfo.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateProjectInfoResponse
* @Description UpdateProjectInfo 返回体
*/
@Data
@ToString
public class UpdateProjectInfoResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
