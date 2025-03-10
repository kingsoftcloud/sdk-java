package ksyun.client.kec.setvcpu.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname SetvCPURequest
 * @Description 请求参数
 */
@Data
public class SetvCPURequest {
    /**
     * 专属集群id
     */
    @KsYunField(name = "DedicatedHostId")
    private List<String> DedicatedHostIdList;

    /**
     * 虚拟核数
     */
    @KsYunField(name = "VCPU")
    private Integer VCPU;

}