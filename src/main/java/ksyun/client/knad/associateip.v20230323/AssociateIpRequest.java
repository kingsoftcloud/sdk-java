package ksyun.client.knad.associateip.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AssociateIpRequest
* @Description 请求参数
*/
@Data
public class AssociateIpRequest{
    /***/
    @KsYunField(name="KnadId")
    private String KnadId;

    /**高防实例绑定的全量eip列表(注：覆盖式更新！！在请求中提交需要绑定的完整eip列表参数)*/
    @KsYunField(name="Ip",type=2)
    private List<String> IpList;

}
