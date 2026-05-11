package ksyun.client.kscc.describequotaglobalconfig.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeQuotaGlobalConfigResponse
* @Description DescribeQuotaGlobalConfig 返回体
*/
@Data
@ToString
public class DescribeQuotaGlobalConfigResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**配额全局配置*/
    @JsonProperty("DescribeQuotaGlobalConfigResult")
    private DescribeQuotaGlobalConfigResultDto DescribeQuotaGlobalConfigResult;

    @Data
    @ToString
    public static class DescribeQuotaGlobalConfigResultDto {
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
