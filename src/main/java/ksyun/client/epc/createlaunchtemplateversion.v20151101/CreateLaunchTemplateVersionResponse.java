package ksyun.client.epc.createlaunchtemplateversion.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateLaunchTemplateVersionResponse
* @Description CreateLaunchTemplateVersion 返回体
*/
@Data
@ToString
public class CreateLaunchTemplateVersionResponse extends BaseResponseModel {

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
