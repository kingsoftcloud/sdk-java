package ksyun.client.epc.deletelaunchtemplateversion.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLaunchTemplateVersionResponse
* @Description DeleteLaunchTemplateVersion 返回体
*/
@Data
@ToString
public class DeleteLaunchTemplateVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
