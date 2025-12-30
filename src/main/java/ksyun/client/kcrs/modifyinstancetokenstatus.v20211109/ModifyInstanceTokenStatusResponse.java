package ksyun.client.kcrs.modifyinstancetokenstatus.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceTokenStatusResponse
* @Description ModifyInstanceTokenStatus 返回体
*/
@Data
@ToString
public class ModifyInstanceTokenStatusResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
