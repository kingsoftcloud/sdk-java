package ksyun.client.ked.updatelabel.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateLabelResponse
* @Description UpdateLabel 返回体
*/
@Data
@ToString
public class UpdateLabelResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
