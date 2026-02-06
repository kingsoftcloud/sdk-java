package ksyun.client.kcf.deleteautoscaledtrigger.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAutoScaledTriggerRequest
* @Description 请求参数
*/
@Data
public class DeleteAutoScaledTriggerRequest{
    /***/
    @KsYunField(name="Functionid")
    private String Functionid;

    /***/
    @KsYunField(name="TriggerName")
    private String TriggerName;

}
