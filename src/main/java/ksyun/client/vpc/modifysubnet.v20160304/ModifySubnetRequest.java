package ksyun.client.vpc.modifysubnet.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifySubnetRequest
 * @Description 请求参数
 */
@Data
public class ModifySubnetRequest {
    /**
     * 子网的ID
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 子网的名称
     */
    @KsYunField(name = "SubnetName")
    private String SubnetName;

    /**
     * 子网的Dns1
     */
    @KsYunField(name = "Dns1")
    private String Dns1;

    /**
     * 子网的Dns2
     */
    @KsYunField(name = "Dns2")
    private String Dns2;


}