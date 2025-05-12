package ksyun.client.aicp.getworkspacequota.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetWorkspaceQuotaRequest
 * @Description 请求参数
 */
@Data
public class GetWorkspaceQuotaRequest {
    /**
     * 需要查询的SpaceID
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

}