package ksyun.client.milvus.releasedbinstanceeip.v20231010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ReleaseDBInstanceEipRequest
* @Description 请求参数
*/
@Data
public class ReleaseDBInstanceEipRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
