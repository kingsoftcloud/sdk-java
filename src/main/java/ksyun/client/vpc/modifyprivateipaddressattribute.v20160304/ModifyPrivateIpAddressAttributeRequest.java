package ksyun.client.vpc.modifyprivateipaddressattribute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyPrivateIpAddressAttributeRequest
* @Description 请求参数
*/
@Data
public class ModifyPrivateIpAddressAttributeRequest{
    /**子网ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**私网IP地址*/
    @KsYunField(name="PrivateIpAddress")
    private String PrivateIpAddress;

    /**IP地址状态*/
    @KsYunField(name="Status")
    private String Status;

    /**IP预留状态*/
    @KsYunField(name="AllocateStatus")
    private String AllocateStatus;

}
