package ksyun.client.clickhouse.deleteinstance.v20210101;

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
public class DeleteInstanceRequest{
    /**实例ID列表。*/
    @KsYunField(name = "InstanceIds", type = 1)
    private List<String> InstanceIdsList;

    /**是否直接删除。默认：false 【参数说明：true：立刻删除，false：放入回收站】*/
    @KsYunField(name="DeleteDirectly")
    private Boolean DeleteDirectly;

}
