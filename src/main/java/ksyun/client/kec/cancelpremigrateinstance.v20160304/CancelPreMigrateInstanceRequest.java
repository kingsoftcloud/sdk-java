package ksyun.client.kec.cancelpremigrateinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelPreMigrateInstanceRequest
* @Description 请求参数
*/
@Data
public class CancelPreMigrateInstanceRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}