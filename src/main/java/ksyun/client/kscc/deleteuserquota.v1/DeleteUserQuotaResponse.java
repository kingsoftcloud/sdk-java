package ksyun.client.kscc.deleteuserquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteUserQuotaResponse
* @Description DeleteUserQuota 返回体
*/
@Data
@ToString
public class DeleteUserQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**删除结果*/
    @JsonProperty("DeleteUserQuotaResult")
    private DeleteUserQuotaResultDto DeleteUserQuotaResult;

    @Data
    @ToString
    public static class DeleteUserQuotaResultDto {
        /**已删除配额的用户邮箱前缀*/
        @JsonProperty("UserName")
        private String UserName;

    }

}
