package ksyun.client.kec.describedataguardgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDataGuardGroupRequest
 * @Description 请求参数
 */
@Data
public class DescribeDataGuardGroupRequest {
    /**
     * 待查询的容灾分组ID
     */
    @KsYunField(name = "DataGuardId")
    private String DataGuardId;

    /**
     * 容灾分组名称
     */
    @KsYunField(name = "DataGuardName")
    private String DataGuardName;

}