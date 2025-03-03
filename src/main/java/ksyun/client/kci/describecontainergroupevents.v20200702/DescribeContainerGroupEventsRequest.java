package ksyun.client.kci.describecontainergroupevents.v20200702;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeContainerGroupEventsRequest
 * @Description 请求参数
 */
@Data
public class DescribeContainerGroupEventsRequest {
    /***/
    @KsYunField(name = "ContainerGroupId")
    private String ContainerGroupId;


}