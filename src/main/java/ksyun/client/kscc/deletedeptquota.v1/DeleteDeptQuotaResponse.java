package ksyun.client.kscc.deletedeptquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDeptQuotaResponse
* @Description DeleteDeptQuota 返回体
*/
@Data
@ToString
public class DeleteDeptQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**删除结果*/
    @JsonProperty("DeleteDeptQuotaResult")
    private DeleteDeptQuotaResultDto DeleteDeptQuotaResult;

    @Data
    @ToString
    public static class DeleteDeptQuotaResultDto {
        /**已删除配额的部门ID*/
        @JsonProperty("DeptId")
        private String DeptId;

    }

}
