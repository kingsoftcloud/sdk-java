package ksyun.client.kce.updategrafanapassword.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateGrafanaPasswordRequest
* @Description 请求参数
*/
@Data
public class UpdateGrafanaPasswordRequest{
    /**Grafana所关联的Prometheus的实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**新的Grafana密码有效值：6-24个字符，必须以数字或字母开头，且至少包含一个特殊字符，支持英文特殊字符@$!%*#?&*/
    @KsYunField(name="Password")
    private String Password;

}
