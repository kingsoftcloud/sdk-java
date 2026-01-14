package ksyun.client.kfw.modifycloudfirewallfeature.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCloudFireWallFeatureRequest
* @Description 请求参数
*/
@Data
public class ModifyCloudFireWallFeatureRequest{
    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**防火墙名称*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

}
