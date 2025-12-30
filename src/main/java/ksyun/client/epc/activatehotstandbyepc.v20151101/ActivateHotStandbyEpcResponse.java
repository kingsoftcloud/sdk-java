package ksyun.client.epc.activatehotstandbyepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ActivateHotStandbyEpcResponse
* @Description ActivateHotStandbyEpc 返回体
*/
@Data
@ToString
public class ActivateHotStandbyEpcResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
