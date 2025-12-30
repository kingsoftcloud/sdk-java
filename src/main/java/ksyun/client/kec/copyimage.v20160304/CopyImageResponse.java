package ksyun.client.kec.copyimage.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CopyImageResponse
* @Description CopyImage 返回体
*/
@Data
@ToString
public class CopyImageResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
