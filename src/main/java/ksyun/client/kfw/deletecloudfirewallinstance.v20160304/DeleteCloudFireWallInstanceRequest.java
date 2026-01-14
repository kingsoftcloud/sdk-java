package ksyun.client.kfw.deletecloudfirewallinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCloudFireWallInstanceRequest
* @Description 请求参数
*/
@Data
public class DeleteCloudFireWallInstanceRequest{
    /**云防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

}
