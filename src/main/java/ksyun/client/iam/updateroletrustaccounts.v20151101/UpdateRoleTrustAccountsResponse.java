package ksyun.client.iam.updateroletrustaccounts.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdateRoleTrustAccountsResponse
 * @Description UpdateRoleTrustAccounts 返回体
 */
@Data
@ToString
public class UpdateRoleTrustAccountsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
