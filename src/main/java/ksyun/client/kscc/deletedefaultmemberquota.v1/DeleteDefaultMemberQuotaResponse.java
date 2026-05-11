package ksyun.client.kscc.deletedefaultmemberquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDefaultMemberQuotaResponse
* @Description DeleteDefaultMemberQuota 返回体
*/
@Data
@ToString
public class DeleteDefaultMemberQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**删除结果*/
    @JsonProperty("DeleteDefaultMemberQuotaResult")
    private DeleteDefaultMemberQuotaResultDto DeleteDefaultMemberQuotaResult;

    @Data
    @ToString
    public static class DeleteDefaultMemberQuotaResultDto {
        /**删除后的默认成员配额，固定为0*/
        @JsonProperty("DefaultMemberQuota")
        private Double DefaultMemberQuota;

    }

}
