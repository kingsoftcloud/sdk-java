package ksyun.client.monitor.addalarmreceives.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AddAlarmReceivesRequest
 * @Description 请求参数
 */
@Data
public class AddAlarmReceivesRequest {
    /**
     * 告警策略ID，详见[查询告警策略](https://docs.ksyun.com/documents/40346)
     */
    @KsYunField(name = "PolicyId")
    private Integer PolicyId;

    /**
     * 告警联系人类型。取值：
     * - 1: 联系组
     * - 2: 联系人
     */
    @KsYunField(name = "ContactFlag")
    private Integer ContactFlag;

    /**
     * 告警通知方式。取值：
     * - 1: 发送邮件
     * - 2: 发送短信
     * - 3: 发送邮件和短信
     */
    @KsYunField(name = "ContactWay")
    private Integer ContactWay;

    /**
     * 告警联系人ID或告警联系组ID。
     * <p>
     * > **说明：** 参数支持多个联系人或联系组ID。
     */
    @KsYunField(name = "ContactId", type = 2)
    private List<Integer> ContactIdList;

}