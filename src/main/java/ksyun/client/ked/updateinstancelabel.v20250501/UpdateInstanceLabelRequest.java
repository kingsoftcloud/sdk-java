package ksyun.client.ked.updateinstancelabel.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname UpdateInstanceLabelRequest
 * @Description 请求参数
 */
@Data
public class UpdateInstanceLabelRequest {
    /**
     * 标签id
     */
    @KsYunField(name = "labelId", type = 2)
    private List<Integer> LabelIdList;

    /**
     * 云桌面实例id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

}