package ksyun.client.kec.instancemigrate.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname InstanceMigrateRequest
 * @Description 请求参数
 */
@Data
public class InstanceMigrateRequest {
    /**
     * 专属宿主机id
     */
    @KsYunField(name = "DedicatedHostId")
    private String DedicatedHostId;

    /**
     * 虚拟机ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 套餐类型
     */
    @KsYunField(name = "InstanceType")
    private String InstanceType;

    /**
     * 数据盘id
     */
    @KsYunField(name = "DataDisk")
    private List<String> DataDiskList;


}