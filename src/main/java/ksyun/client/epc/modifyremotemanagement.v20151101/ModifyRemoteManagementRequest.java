package ksyun.client.epc.modifyremotemanagement.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyRemoteManagementRequest
* @Description 请求参数
*/
@Data
public class ModifyRemoteManagementRequest{
    /**带外管理的ID*/
    @KsYunField(name="RemoteManagementId")
    private String RemoteManagementId;

    /**手机动态码*/
    @KsYunField(name="DynamicCode")
    private String DynamicCode;

    /**个人识别码*/
    @KsYunField(name="Pin")
    private String Pin;

    /**新手机号码*/
    @KsYunField(name="NewPhoneNumber")
    private String NewPhoneNumber;

    /**个人识别码*/
    @KsYunField(name="NewPin")
    private String NewPin;

    /**姓名*/
    @KsYunField(name="Name")
    private String Name;

    /**版本ID*/
    @KsYunField(name="VersionId")
    private Long VersionId;

}
