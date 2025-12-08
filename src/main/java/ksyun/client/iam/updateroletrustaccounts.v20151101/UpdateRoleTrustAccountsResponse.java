package ksyun.client.iam.updateroletrustaccounts.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateRoleTrustAccountsResponse
* @Description UpdateRoleTrustAccounts 返回体
*/
@Data
@ToString
public class UpdateRoleTrustAccountsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
