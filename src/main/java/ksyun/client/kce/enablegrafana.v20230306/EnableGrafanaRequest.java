package ksyun.client.kce.enablegrafana.v20230306;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname EnableGrafanaRequest
 * @Description 请求参数
 */
@Data
public class EnableGrafanaRequest {
    /**
     * Grafana所关联的Prometheus的实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 开通或关闭Grafana，true为开启，false 为不开启
     */
    @KsYunField(name = "EnableGrafana")
    private Boolean EnableGrafana;

    /**
     * 开通Grafana时需设置Grafana密码有效值：6-24个字符，必须以数字或字母开头，且至少包含一个特殊字符，支持英文特殊字符@$!%*#?&
     */
    @KsYunField(name = "Password")
    private String Password;


}