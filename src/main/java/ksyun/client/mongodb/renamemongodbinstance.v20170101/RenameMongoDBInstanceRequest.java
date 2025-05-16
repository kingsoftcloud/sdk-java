package ksyun.client.mongodb.renamemongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname RenameMongoDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class RenameMongoDBInstanceRequest {
    /**
     * 服务ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 服务名称
     */
    @KsYunField(name = "Name")
    private String Name;

}