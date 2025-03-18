package ksyun.client.ked.deletelabel.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteLabelRequest
 * @Description 请求参数
 */
@Data
public class DeleteLabelRequest {
    /**
     * 标签id
     */
    @KsYunField(name = "id", type = 2)
    private List<Integer> IdList;

}