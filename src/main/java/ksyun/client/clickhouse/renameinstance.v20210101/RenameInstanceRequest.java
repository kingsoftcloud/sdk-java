package ksyun.client.clickhouse.renameinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RenameInstanceRequest
* @Description 请求参数
*/
@Data
public class RenameInstanceRequest{
    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**实例新名称。*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

}
