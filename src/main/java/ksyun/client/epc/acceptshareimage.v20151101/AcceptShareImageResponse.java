package ksyun.client.epc.acceptshareimage.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AcceptShareImageResponse
* @Description AcceptShareImage 返回体
*/
@Data
@ToString
public class AcceptShareImageResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
