package ksyun.client.monitor.updatealertuserstatus.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname UpdateAlertUserStatusRequest
 * @Description 请求参数
 */
@Data
public class UpdateAlertUserStatusRequest {
    /**
     * 联系人ID，支持多个。
     */
    @KsYunField(name = "UserId", type = 2)
    private List<Integer> UserIdList;

    /**
     * 告警联系人状态。取值：
     * - 1：启用
     * - 2：禁用
     */
    @KsYunField(name = "UserStatus")
    private Integer UserStatus;


}