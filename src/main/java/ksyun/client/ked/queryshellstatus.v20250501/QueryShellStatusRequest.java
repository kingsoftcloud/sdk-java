package ksyun.client.ked.queryshellstatus.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname QueryShellStatusRequest
 * @Description 请求参数
 */
@Data
public class QueryShellStatusRequest {
    /**
     * 云电脑 id,多个使用英文逗号分隔
     */
    @KsYunField(name = "instanceIds")
    private String InstanceIds;

    /**
     * 任务id
     */
    @KsYunField(name = "planId")
    private Integer PlanId;

}