package ksyun.client.epc.installagent.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname InstallAgentRequest
* @Description 请求参数
*/
@Data
public class InstallAgentRequest{
    /**实例ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**安装agentID*/
    @KsYunField(name="AgentId")
    private String AgentId;

    /**用户名*/
    @KsYunField(name="Username")
    private String Username;

    /**密码*/
    @KsYunField(name="Password")
    private String Password;

    /**密钥*/
    @KsYunField(name="Key")
    private String Key;

}
