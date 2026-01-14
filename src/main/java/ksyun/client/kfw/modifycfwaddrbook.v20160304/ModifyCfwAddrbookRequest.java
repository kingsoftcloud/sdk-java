package ksyun.client.kfw.modifycfwaddrbook.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCfwAddrbookRequest
* @Description 请求参数
*/
@Data
public class ModifyCfwAddrbookRequest{
    /**云防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**地址簿名称*/
    @KsYunField(name="AddrbookName")
    private String AddrbookName;

    /**ip集合*/
    @KsYunField(name="IpAddress",type=2)
    private List<String> IpAddressList;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

    /**IPv4*/
    @KsYunField(name="IpVersion")
    private String IpVersion;

}
