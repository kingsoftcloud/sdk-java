package ksyun.client.kad.describeforwardconf.v20161122;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeForwardConfRequest
 * @Description 请求参数
 */
@Data
public class DescribeForwardConfRequest {
    /**
     * 高防服务的实例ID
     */
    @KsYunField(name = "KadId")
    private String KadId;

    /**
     * 一个或多个四层转发配置的ID
     */
    @KsYunField(name = "ForwardConfId")
    private List<String> ForwardConfIdList;

}