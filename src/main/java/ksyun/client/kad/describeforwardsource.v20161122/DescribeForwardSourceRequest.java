package ksyun.client.kad.describeforwardsource.v20161122;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeForwardSourceRequest
 * @Description 请求参数
 */
@Data
public class DescribeForwardSourceRequest {
    /**
     * 四层转发配置ID
     */
    @KsYunField(name = "ForwardConfId")
    private String ForwardConfId;

    /**
     * 一个或多个四层转发源站配置的ID
     */
    @KsYunField(name = "ForwardSourceId")
    private List<String> ForwardSourceIdList;

}