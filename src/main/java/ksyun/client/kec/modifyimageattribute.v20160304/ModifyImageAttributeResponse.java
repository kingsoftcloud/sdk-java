package ksyun.client.kec.modifyimageattribute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyImageAttributeResponse
* @Description ModifyImageAttribute 返回体
*/
@Data
@ToString
public class ModifyImageAttributeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
