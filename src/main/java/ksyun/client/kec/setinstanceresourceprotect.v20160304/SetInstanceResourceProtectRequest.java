package ksyun.client.kec.setinstanceresourceprotect.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetInstanceResourceProtectRequest
 * @Description 请求参数
 */
@Data
public class SetInstanceResourceProtectRequest {
    /**
     * 待修改资源保护的实例ID列表，N的范围为1-100 标准UUID格式
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

    /**
     * 是否打开资源保护
     */
    @KsYunField(name = "IsProtection")
    private Boolean IsProtection;

}