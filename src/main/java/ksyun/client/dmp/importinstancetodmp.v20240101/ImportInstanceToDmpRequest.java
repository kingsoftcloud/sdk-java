package ksyun.client.dmp.importinstancetodmp.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ImportInstanceToDmpRequest
 * @Description 请求参数
 */
@Data
public class ImportInstanceToDmpRequest {
    /***/
    @KsYunField(name = "InstanceRegion")
    private String InstanceRegion;

    /***/
    @KsYunField(name = "DatabaseType")
    private String DatabaseType;

    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}