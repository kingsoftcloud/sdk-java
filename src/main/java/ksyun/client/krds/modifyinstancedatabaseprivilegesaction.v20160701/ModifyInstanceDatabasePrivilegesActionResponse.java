package ksyun.client.krds.modifyinstancedatabaseprivilegesaction.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceDatabasePrivilegesActionResponse
* @Description ModifyInstanceDatabasePrivilegesAction 返回体
*/
@Data
@ToString
public class ModifyInstanceDatabasePrivilegesActionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
