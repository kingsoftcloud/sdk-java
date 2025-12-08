package ksyun.client.epc.usehotstandbyepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UseHotStandByEpcResponse
* @Description UseHotStandByEpc 返回体
*/
@Data
@ToString
public class UseHotStandByEpcResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
