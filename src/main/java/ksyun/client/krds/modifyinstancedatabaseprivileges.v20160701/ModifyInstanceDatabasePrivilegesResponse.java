package ksyun.client.krds.modifyinstancedatabaseprivileges.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyInstanceDatabasePrivilegesResponse
 * @Description ModifyInstanceDatabasePrivileges 返回体
 */
@Data
@ToString
public class ModifyInstanceDatabasePrivilegesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
