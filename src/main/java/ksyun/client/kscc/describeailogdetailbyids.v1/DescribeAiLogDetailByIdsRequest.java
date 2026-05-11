package ksyun.client.kscc.describeailogdetailbyids.v1;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAiLogDetailByIdsRequest
* @Description 请求参数
*/
@Data
public class DescribeAiLogDetailByIdsRequest{
    /**消息ID，多个用逗号分隔*/
    @KsYunField(name="MessageIds")
    private String MessageIds;

}
