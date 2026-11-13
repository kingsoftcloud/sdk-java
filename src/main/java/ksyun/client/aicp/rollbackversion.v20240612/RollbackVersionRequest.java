package ksyun.client.aicp.rollbackversion.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RollbackVersionRequest
* @Description 请求参数
*/
@Data
public class RollbackVersionRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="TargetVersionId")
    private String TargetVersionId;

    /***/
    @KsYunField(name="TargetTag")
    private String TargetTag;

}
