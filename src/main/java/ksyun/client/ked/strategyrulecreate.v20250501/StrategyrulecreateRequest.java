package ksyun.client.ked.strategyrulecreate.v20250501;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname StrategyrulecreateRequest
 * @Description 请求参数
 */
@Data
public class StrategyrulecreateRequest {
    /**
     * 策略名称
     */
    @KsYunField(name = "name")
    private String Name;

    /**
     * 策略描述
     */
    @KsYunField(name = "description")
    private String Description;

    /**
     * 安全组出站规则
     */
    @KsYunField(name = "policies", type = 2)
    private List<PoliciesDto> PoliciesList;

    @Data
    @ToString
    public static class PoliciesDto {
        /***/
        private String Description;
        /**
         * out：流出
         * 暂不允许流入规则添加
         */
        private String Direction;
        /**
         * ip 值，支持段 ip
         * 0.0.0.0/0
         */
        private String CidrBlock;
        /**
         * 最大端口号，1～65535
         */
        private Integer MaxPortRange;
        /**
         * 最小端口号
         */
        private Integer MinPortRange;
        /**
         * TCP
         * UDP
         * ICMP
         * IP
         */
        private String Protocol;
    }


}