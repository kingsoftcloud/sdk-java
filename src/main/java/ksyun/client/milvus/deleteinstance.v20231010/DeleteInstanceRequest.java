package ksyun.client.milvus.deleteinstance.v20231010;

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
    /**
     * 实例ID列表，可用英文逗号分隔，传递多个。
     */
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;

}