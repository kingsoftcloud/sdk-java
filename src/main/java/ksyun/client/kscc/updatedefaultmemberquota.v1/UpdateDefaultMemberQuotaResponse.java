package ksyun.client.kscc.updatedefaultmemberquota.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateDefaultMemberQuotaResponse
* @Description UpdateDefaultMemberQuota 返回体
*/
@Data
@ToString
public class UpdateDefaultMemberQuotaResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**更新后的全局配置*/
    @JsonProperty("UpdateDefaultMemberQuotaResult")
    private UpdateDefaultMemberQuotaResultDto UpdateDefaultMemberQuotaResult;

    @Data
    @ToString
    public static class UpdateDefaultMemberQuotaResultDto {
        /**预警阈值百分比*/
        @JsonProperty("WarnThreshold")
        private Integer WarnThreshold;

        /**费用折扣，例如9表示9折*/
        @JsonProperty("Discount")
        private Double Discount;

        /**预警联系人JSON字符串*/
        @JsonProperty("ContactsJson")
        private String ContactsJson;

        /**账号配额开关，1启用，0禁用*/
        @JsonProperty("AccountEnabled")
        private Integer AccountEnabled;

        /**部门配额开关，1启用，0禁用*/
        @JsonProperty("DeptEnabled")
        private Integer DeptEnabled;

        /**成员配额开关，1启用，0禁用*/
        @JsonProperty("MemberEnabled")
        private Integer MemberEnabled;

        /**默认成员月度配额*/
        @JsonProperty("DefaultMemberQuota")
        private Double DefaultMemberQuota;

    }

}
