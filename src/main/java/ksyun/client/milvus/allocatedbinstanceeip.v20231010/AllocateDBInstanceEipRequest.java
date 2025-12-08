package ksyun.client.milvus.allocatedbinstanceeip.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AllocateDBInstanceEipRequest
* @Description 请求参数
*/
@Data
public class AllocateDBInstanceEipRequest{
    /**实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**是否指定EIP端口号，若不指定则自动分配*/
    @KsYunField(name="Port")
    private Integer Port;

}
