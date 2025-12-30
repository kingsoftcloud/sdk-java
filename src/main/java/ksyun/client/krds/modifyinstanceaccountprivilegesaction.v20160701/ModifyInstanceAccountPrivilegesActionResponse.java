package ksyun.client.krds.modifyinstanceaccountprivilegesaction.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceAccountPrivilegesActionResponse
* @Description ModifyInstanceAccountPrivilegesAction 返回体
*/
@Data
@ToString
public class ModifyInstanceAccountPrivilegesActionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /***/
    @JsonProperty("InstanceAccountName")
    private String InstanceAccountName;

    /***/
    @JsonProperty("InstanceAccountPrivileges")
    private List<String> InstanceAccountPrivileges;

}
