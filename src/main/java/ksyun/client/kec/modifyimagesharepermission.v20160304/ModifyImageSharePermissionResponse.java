package ksyun.client.kec.modifyimagesharepermission.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyImageSharePermissionResponse
* @Description ModifyImageSharePermission 返回体
*/
@Data
@ToString
public class ModifyImageSharePermissionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Message")
    private String Message;

}
