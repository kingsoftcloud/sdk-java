package ksyun.client.kscc.updatedeptquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateDeptQuotaResponse
* @Description UpdateDeptQuota 返回体
*/
@Data
@ToString
public class UpdateDeptQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**更新结果*/
    @JsonProperty("UpdateDeptQuotaResult")
    private UpdateDeptQuotaResultDto UpdateDeptQuotaResult;

    @Data
    @ToString
    public static class UpdateDeptQuotaResultDto {
        /**部门ID*/
        @JsonProperty("DeptId")
        private String DeptId;

        /**部门月度配额*/
        @JsonProperty("QuotaAmount")
        private Double QuotaAmount;

    }

}
