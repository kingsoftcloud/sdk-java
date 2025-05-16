package ksyun.client.knad.disassociateip.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DisassociateIpRequest
 * @Description 请求参数
 */
@Data
public class DisassociateIpRequest {
    /**
     * 要解绑的ip
     */
    @KsYunField(name = "Ip", type = 2)
    private List<String> IpList;

}