package ksyun.client.influxdb.grantaccountprivilege.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GrantAccountPrivilegeResponse
 * @Description GrantAccountPrivilege 返回体
 */
@Data
@ToString
public class GrantAccountPrivilegeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
