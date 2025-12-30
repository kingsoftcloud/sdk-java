package ksyun.client.sqlserver.modifyinstancedatabaseprivileges.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceDatabasePrivilegesResponse
* @Description ModifyInstanceDatabasePrivileges 返回体
*/
@Data
@ToString
public class ModifyInstanceDatabasePrivilegesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
