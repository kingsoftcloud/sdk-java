package ksyun.client.epc.createlaunchtemplate.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateLaunchTemplateResponse
* @Description CreateLaunchTemplate 返回体
*/
@Data
@ToString
public class CreateLaunchTemplateResponse extends BaseResponseModel {

    /***/
    @JsonProperty("LaunchTemplateId")
    private String LaunchTemplateId;

    /***/
    @JsonProperty("LaunchTemplateVersionNumber")
    private Integer LaunchTemplateVersionNumber;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
