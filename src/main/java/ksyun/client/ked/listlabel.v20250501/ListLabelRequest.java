package ksyun.client.ked.listlabel.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListLabelRequest
 * @Description 请求参数
 */
@Data
public class ListLabelRequest {
    /**
     * 标签名
     */
    @KsYunField(name = "name")
    private String Name;

}