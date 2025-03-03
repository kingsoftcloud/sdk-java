package ksyun.client.ked.strategyruleedit.v20250501;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname StrategyruleeditRequest
 * @Description 请求参数
 */
@Data
public class StrategyruleeditRequest {
    /**
     * 安全组出站规则
     */
    @KsYunField(name = "policies")
    private PoliciesDto Policies;
    /**
     * 策略组 id
     */
    @KsYunField(name = "securityGroupId")
    private String SecurityGroupId;

    @Data
    @ToString
    public static class PoliciesDto {
        /**
         * 规则描述
         */
        @KsYunField(name = "description")
        private String Description;

        /**
         * out：流出
         * 暂不允许流入规则添加
         */
        @KsYunField(name = "direction")
        private String Direction;

        /**
         * ip 值
         */
        @KsYunField(name = "cidrBlock")
        private String CidrBlock;

        /**
         * 最大端口号，0 表示所有端口
         */
        @KsYunField(name = "maxPortRange")
        private String MaxPortRange;

        /**
         * 最小端口号，0 标识所有端口
         */
        @KsYunField(name = "minPortRange")
        private String MinPortRange;

        /**
         * 固定值 ANY
         */
        @KsYunField(name = "protocol")
        private String Protocol;
    }
}