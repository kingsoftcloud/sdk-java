package ksyun.client.kec.modifyinstanceattribute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceAttributeResponse
* @Description ModifyInstanceAttribute 返回体
*/
@Data
@ToString
public class ModifyInstanceAttributeResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**修改实例属性信息成功与否*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
