package ksyun.client.epc.autodeleteepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AutoDeleteEpcResponse
* @Description AutoDeleteEpc 返回体
*/
@Data
@ToString
public class AutoDeleteEpcResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
