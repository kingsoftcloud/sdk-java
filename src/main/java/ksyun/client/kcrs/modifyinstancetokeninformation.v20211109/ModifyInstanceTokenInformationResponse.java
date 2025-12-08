package ksyun.client.kcrs.modifyinstancetokeninformation.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceTokenInformationResponse
* @Description ModifyInstanceTokenInformation 返回体
*/
@Data
@ToString
public class ModifyInstanceTokenInformationResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
