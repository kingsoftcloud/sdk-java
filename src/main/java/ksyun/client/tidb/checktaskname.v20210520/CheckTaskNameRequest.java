package ksyun.client.tidb.checktaskname.v20210520;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CheckTaskNameRequest
 * @Description 请求参数
 */
@Data
public class CheckTaskNameRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}