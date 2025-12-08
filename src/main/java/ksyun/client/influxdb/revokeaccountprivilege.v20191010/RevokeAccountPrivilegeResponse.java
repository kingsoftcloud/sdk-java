package ksyun.client.influxdb.revokeaccountprivilege.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RevokeAccountPrivilegeResponse
* @Description RevokeAccountPrivilege 返回体
*/
@Data
@ToString
public class RevokeAccountPrivilegeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
