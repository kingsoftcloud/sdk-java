package ksyun.client.kec.updatesnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class UpdateSnapshotPolicyRequest{
    /**策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**策略名称*/
    @KsYunField(name="AutoSnapshotPolicyName")
    private String AutoSnapshotPolicyName;

    /**自动快照策略备份周期。有效值：
• day：按天（默认值）
• week：按周
• month：按月*/
    @KsYunField(name="FrequencyUnit")
    private String FrequencyUnit;

    /**备份日期
按天不传, 按周（必传）（1-7 可多选）按月（必传）（1-31 ）[1，2，3，4，5]*/
    @KsYunField(name="IndexOfFrequency",type=1)
    private List<Integer> IndexOfFrequencyList;

    /**备份时间点
快照定期备份时间点（在一天的哪一小时） 00:00，01:00 ...  默认 00:00，只支持小时*/
    @KsYunField(name="SnapshotTimePoint",type=1)
    private List<String> SnapshotTimePointList;

    /**快照保留天数*/
    @KsYunField(name="AliveDays")
    private Integer AliveDays;

}
