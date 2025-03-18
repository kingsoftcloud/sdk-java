package ksyun.client.ked.createlabel.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateLabelRequest
 * @Description 请求参数
 */
@Data
public class CreateLabelRequest {
    /**
     * 标签名
     */
    @KsYunField(name = "name")
    private String Name;

}