package ksyun.client.epc.modifyimage.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyImageResponse
* @Description ModifyImage 返回体
*/
@Data
@ToString
public class ModifyImageResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
