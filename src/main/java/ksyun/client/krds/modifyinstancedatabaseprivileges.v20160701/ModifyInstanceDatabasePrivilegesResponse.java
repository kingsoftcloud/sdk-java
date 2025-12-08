package ksyun.client.krds.modifyinstancedatabaseprivileges.v20160701;

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
    /**请求ID	
	–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
