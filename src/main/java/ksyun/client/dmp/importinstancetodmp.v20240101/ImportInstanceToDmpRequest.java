package ksyun.client.dmp.importinstancetodmp.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ImportInstanceToDmpRequest
* @Description 请求参数
*/
@Data
public class ImportInstanceToDmpRequest{
    /***/
    @KsYunField(name="InstanceRegion")
    private String InstanceRegion;

    /***/
    @KsYunField(name="DatabaseType")
    private String DatabaseType;

    /***/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
