package ksyun.client.influxdb.deleteinstance.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceRequest {
    /***/
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;

}