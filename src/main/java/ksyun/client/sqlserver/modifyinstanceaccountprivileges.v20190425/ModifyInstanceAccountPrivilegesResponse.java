package ksyun.client.sqlserver.modifyinstanceaccountprivileges.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceAccountPrivilegesResponse
* @Description ModifyInstanceAccountPrivileges 返回体
*/
@Data
@ToString
public class ModifyInstanceAccountPrivilegesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
