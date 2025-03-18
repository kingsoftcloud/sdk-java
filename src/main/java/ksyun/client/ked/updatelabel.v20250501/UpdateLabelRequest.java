package ksyun.client.ked.updatelabel.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateLabelRequest
 * @Description 请求参数
 */
@Data
public class UpdateLabelRequest {
    /**
     * 标签id
     */
    @KsYunField(name = "id")
    private Integer Id;

    /**
     * 标签名
     */
    @KsYunField(name = "name")
    private String Name;

}