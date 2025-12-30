package ksyun.client.kec.modifyinstanceimage.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceImageResponse
* @Description ModifyInstanceImage 返回体
*/
@Data
@ToString
public class ModifyInstanceImageResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**更换或者重装实例操作系统成功与否*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
