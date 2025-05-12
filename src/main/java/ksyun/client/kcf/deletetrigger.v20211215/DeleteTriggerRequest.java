package ksyun.client.kcf.deletetrigger.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteTriggerRequest
 * @Description 请求参数
 */
@Data
public class DeleteTriggerRequest {
    /**
     * 触发器ID
     */
    @KsYunField(name = "Id")
    private String Id;

}