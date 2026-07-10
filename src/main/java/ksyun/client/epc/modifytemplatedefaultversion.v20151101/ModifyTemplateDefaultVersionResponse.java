package ksyun.client.epc.modifytemplatedefaultversion.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyTemplateDefaultVersionResponse
* @Description ModifyTemplateDefaultVersion 返回体
*/
@Data
@ToString
public class ModifyTemplateDefaultVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
