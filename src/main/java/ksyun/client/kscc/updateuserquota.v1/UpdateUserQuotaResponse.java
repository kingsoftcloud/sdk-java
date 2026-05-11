package ksyun.client.kscc.updateuserquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateUserQuotaResponse
* @Description UpdateUserQuota 返回体
*/
@Data
@ToString
public class UpdateUserQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**更新结果*/
    @JsonProperty("UpdateUserQuotaResult")
    private UpdateUserQuotaResultDto UpdateUserQuotaResult;

    @Data
    @ToString
    public static class UpdateUserQuotaResultDto {
        /**用户邮箱前缀*/
        @JsonProperty("UserName")
        private String UserName;

        /**更新后的用户月度配额*/
        @JsonProperty("QuotaAmount")
        private Double QuotaAmount;

    }

}
