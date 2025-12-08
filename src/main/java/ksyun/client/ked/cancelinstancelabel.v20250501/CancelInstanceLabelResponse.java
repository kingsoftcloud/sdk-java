package ksyun.client.ked.cancelinstancelabel.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelInstanceLabelResponse
* @Description CancelInstanceLabel 返回体
*/
@Data
@ToString
public class CancelInstanceLabelResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
