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

    /***/
    @JsonProperty("UpdateUserQuotaResult")
    private UpdateUserQuotaResultDto UpdateUserQuotaResult;

    @Data
    @ToString
    public static class UpdateUserQuotaResultDto {
        /**用户邮箱前缀，比如： zhangsan3*/
        @JsonProperty("UserName")
        private String UserName;

        /**月度配额限制,当不设置此属性，代表删除用户的配额限制。*/
        @JsonProperty("QuotaAmount")
        private Integer QuotaAmount;

    }

}
