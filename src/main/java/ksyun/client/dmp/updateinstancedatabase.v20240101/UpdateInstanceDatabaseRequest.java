package ksyun.client.dmp.updateinstancedatabase.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateInstanceDatabaseRequest
* @Description 请求参数
*/
@Data
public class UpdateInstanceDatabaseRequest{
    /**实例Id.*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
