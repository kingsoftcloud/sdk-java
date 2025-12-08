package ksyun.client.influxdb.grantaccountprivilege.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GrantAccountPrivilegeResponse
* @Description GrantAccountPrivilege 返回体
*/
@Data
@ToString
public class GrantAccountPrivilegeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
