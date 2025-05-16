package ksyun.client.dts.describeprecheck.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribePrecheckRequest
 * @Description 请求参数
 */
@Data
public class DescribePrecheckRequest {
    /**
     * 预检查任务ID
     */
    @KsYunField(name = "PrecheckId")
    private String PrecheckId;

}