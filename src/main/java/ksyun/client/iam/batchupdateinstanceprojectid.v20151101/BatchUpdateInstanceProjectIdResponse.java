package ksyun.client.iam.batchupdateinstanceprojectid.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchUpdateInstanceProjectIdResponse
* @Description BatchUpdateInstanceProjectId 返回体
*/
@Data
@ToString
public class BatchUpdateInstanceProjectIdResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
