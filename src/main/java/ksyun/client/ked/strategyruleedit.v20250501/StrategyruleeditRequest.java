package ksyun.client.ked.strategyruleedit.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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

    private PoliciesDto PoliciesList;

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
        private Integer MaxPortRange;
        /**
         * 最小端口号，0 标识所有端口
         */
        @KsYunField(name = "minPortRange")
        private Integer MinPortRange;
        /**
         * TCP
         * UDP
         * ICMP
         * IP
         */
        @KsYunField(name = "protocol")
        private String Protocol;
    }

    /**
     * 策略组 id
     */
    @KsYunField(name = "securityGroupId")
    private String SecurityGroupId;

}