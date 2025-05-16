package ksyun.client.dts.describeconsistencycheck.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeConsistencyCheckRequest
 * @Description 请求参数
 */
@Data
public class DescribeConsistencyCheckRequest {
    /**
     * 主任务ID
     */
    @KsYunField(name = "TaskId")
    private String TaskId;

}