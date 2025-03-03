package ksyun.client.knad.associateip.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AssociateIpRequest
 * @Description 请求参数
 */
@Data
public class AssociateIpRequest {
    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

    /**
     * 高防实例绑定的eip列表(注：覆盖式更新！！在请求中提交需要绑定的完整eip参数)
     */
    @KsYunField(name = "Ip", type = 2)
    private List<String> IpList;

}