package ksyun.client.kscc.deleteaccountquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAccountQuotaResponse
* @Description DeleteAccountQuota 返回体
*/
@Data
@ToString
public class DeleteAccountQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**删除结果*/
    @JsonProperty("DeleteAccountQuotaResult")
    private DeleteAccountQuotaResultDto DeleteAccountQuotaResult;

    @Data
    @ToString
    public static class DeleteAccountQuotaResultDto {
        /**账号配额固定标识*/
        @JsonProperty("AccountId")
        private String AccountId;

    }

}
