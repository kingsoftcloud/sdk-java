package ksyun.client.rabbitmq.rename.v20191017;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RenameRequest
* @Description 请求参数
*/
@Data
public class RenameRequest{
    /**实例Id。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**实例新名称。*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

}
