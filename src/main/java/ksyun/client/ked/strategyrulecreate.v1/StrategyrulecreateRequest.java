package ksyun.client.ked.strategyrulecreate.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StrategyrulecreateRequest
* @Description 请求参数
*/
@Data
public class StrategyrulecreateRequest{
    /**策略名称*/
    @KsYunField(name="name")
    private String Name;

    /**策略描述*/
    @KsYunField(name="description")
    private String Description;

    /**安全组出站规则*/
    @KsYunField(name="policies",type=2)
    private List<PoliciesDto> PoliciesList;

    @Data
    @ToString
    public static class PoliciesDto {
        /***/
        @KsYunField(name="description")
        private String Description;

        /**out：流出
暂不允许流入规则添加*/
        @KsYunField(name="direction")
        private String Direction;

        /**ip值,支持ip段 0.0.0.0/0*/
        @KsYunField(name="cidrBlock")
        private String CidrBlock;

        /**最大端口号，1～65535*/
        @KsYunField(name="maxPortRange")
        private Integer MaxPortRange;

        /**最小端口号*/
        @KsYunField(name="minPortRange")
        private Integer MinPortRange;

        /**ip|tcp|udp|icmp*/
        @KsYunField(name="protocol")
        private String Protocol;

    }

}
