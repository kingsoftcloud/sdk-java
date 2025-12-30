package ksyun.client.ked.updateinstancelabel.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateInstanceLabelResponse
* @Description UpdateInstanceLabel 返回体
*/
@Data
@ToString
public class UpdateInstanceLabelResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
