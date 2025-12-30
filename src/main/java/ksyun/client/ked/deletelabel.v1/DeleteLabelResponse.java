package ksyun.client.ked.deletelabel.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLabelResponse
* @Description DeleteLabel 返回体
*/
@Data
@ToString
public class DeleteLabelResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
