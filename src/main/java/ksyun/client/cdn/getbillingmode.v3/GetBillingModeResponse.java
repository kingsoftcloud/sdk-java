package ksyun.client.cdn.getbillingmode.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetBillingModeResponse
* @Description GetBillingMode 返回体
*/
@Data
@ToString
public class GetBillingModeResponse extends BaseResponseModel {

    /**GetBillingModeResponse*/
    @JsonProperty("GetBillingModeResponse")
    private String GetBillingModeResponse;

}
