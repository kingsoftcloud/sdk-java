package ksyun.client.epc.deletelaunchtemplate.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLaunchTemplateResponse
* @Description DeleteLaunchTemplate 返回体
*/
@Data
@ToString
public class DeleteLaunchTemplateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
