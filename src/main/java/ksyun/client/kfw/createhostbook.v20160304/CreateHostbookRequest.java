package ksyun.client.kfw.createhostbook.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateHostbookRequest
* @Description 请求参数
*/
@Data
public class CreateHostbookRequest{
    /**云防火墙实例ID，用于指定要操作的防火墙实例*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**域名簿名称，长度不能超过95个字符*/
    @KsYunField(name="HostbookName")
    private String HostbookName;

    /**域名列表，最多可添加1500个域名，支持完整域名和通配符域名*/
    @KsYunField(name="HostValue",type=2)
    private List<String> HostValueList;

    /**域名簿描述信息，长度不能超过255个字符*/
    @KsYunField(name="Description")
    private String Description;

}
